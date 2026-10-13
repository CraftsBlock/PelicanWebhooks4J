package de.craftsblock.pelicanwebhooks4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import de.craftsblock.craftscore.event.ListenerRegistry;
import de.craftsblock.pelicanwebhooks4j.adapter.OffsetDateTimeTypeAdapter;
import de.craftsblock.pelicanwebhooks4j.event.GenericWebhookEvent;
import de.craftsblock.pelicanwebhooks4j.event.WebhookEventAction;
import de.craftsblock.pelicanwebhooks4j.event.WebhookEventActionRegistry;
import de.craftsblock.pelicanwebhooks4j.event.WebhookEventRegistry;
import org.jetbrains.annotations.NotNull;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.function.Consumer;

public class PelicanWebhooks4J {

    private final ListenerRegistry listenerRegistry;
    private final Consumer<Exception> exceptionHandler;
    private final Gson gson;

    private final WebhookEventRegistry eventRegistry;
    private final WebhookEventActionRegistry eventActionRegistry;

    private PelicanWebhooks4J(@NotNull GsonBuilder gsonBuilder, @NotNull ListenerRegistry listenerRegistry,
                              @NotNull Consumer<Exception> exceptionHandler) {
        this.gson = gsonBuilder
                .registerTypeAdapter(
                        OffsetDateTime.class,
                        new OffsetDateTimeTypeAdapter()
                ).create();

        this.listenerRegistry = listenerRegistry;
        this.exceptionHandler = exceptionHandler;

        this.eventRegistry = new WebhookEventRegistry();
        this.eventActionRegistry = new WebhookEventActionRegistry();
    }

    public void dispatch(String message) {
        this.dispatch(message, Map.of());
    }

    public void dispatch(String message, Map<String, String> headers) {
        try {
            JsonElement json = JsonParser.parseString(message);
            if (!json.isJsonObject()) {
                throw new IllegalArgumentException("The webhook must be a json object");
            }

            String[] eventInfo = json.getAsJsonObject().get("event").getAsString().split(":\\s?", 2);
            WebhookEventAction eventAction = eventActionRegistry.getEventAction(eventInfo[0]);
            String eventName = eventInfo[1];

            Class<? extends GenericWebhookEvent> eventClass = eventRegistry.getEventClass(eventName, eventAction);
            if (eventClass == null) {
                throw new IllegalStateException("No event class found for " + eventName + " with action " + eventAction);
            }

            GenericWebhookEvent event = this.gson.fromJson(json, eventClass);
            event.setHeaders(headers);
            event.setWebhookAction(eventAction);
            this.listenerRegistry.call(event);
        } catch (Exception exception) {
            exceptionHandler.accept(exception);
        }
    }

    public ListenerRegistry getListenerRegistry() {
        return listenerRegistry;
    }

    public Gson getGson() {
        return gson;
    }

    public WebhookEventRegistry getEventRegistry() {
        return eventRegistry;
    }

    public WebhookEventActionRegistry getEventActionRegistry() {
        return eventActionRegistry;
    }

    public static PelicanWebhooks4J newInstance() {
        return newBuilder().build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final GsonBuilder gsonBuilder;

        private ListenerRegistry listenerRegistry;
        private Consumer<Exception> exceptionHandler;

        private Builder() {
            this.gsonBuilder = new GsonBuilder().serializeNulls();

            this.listenerRegistry = ListenerRegistry.global();
            this.exceptionHandler = (exception -> {
                if (exception instanceof RuntimeException runtimeException) {
                    throw runtimeException;
                }

                throw new RuntimeException("Failed to dispatch pelican webhook", exception);
            });
        }

        public void setListenerRegistry(ListenerRegistry listenerRegistry) {
            this.listenerRegistry = listenerRegistry;
        }

        public void setExceptionHandler(Consumer<Exception> exceptionHandler) {
            this.exceptionHandler = exceptionHandler;
        }

        public PelicanWebhooks4J build() {
            return new PelicanWebhooks4J(gsonBuilder, listenerRegistry, exceptionHandler);
        }

    }

}
