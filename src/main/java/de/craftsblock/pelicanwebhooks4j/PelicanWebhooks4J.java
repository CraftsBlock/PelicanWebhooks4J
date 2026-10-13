package de.craftsblock.pelicanwebhooks4j;

import com.google.gson.*;
import de.craftsblock.craftscore.event.EventPriority;
import de.craftsblock.craftscore.event.ListenerRegistry;
import de.craftsblock.pelicanwebhooks4j.adapter.OffsetDateTimeTypeAdapter;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;
import de.craftsblock.pelicanwebhooks4j.event.GenericWebhookEvent;
import de.craftsblock.pelicanwebhooks4j.event.WebhookEventAction;
import de.craftsblock.pelicanwebhooks4j.event.WebhookEventRegistry;
import de.craftsblock.pelicanwebhooks4j.event.known.ActivityLoggedEvent;
import de.craftsblock.pelicanwebhooks4j.event.known.WebhookConfigurationEvent;
import org.jetbrains.annotations.NotNull;

import java.time.OffsetDateTime;
import java.util.function.Consumer;

public class PelicanWebhooks4J {

    private final ListenerRegistry listenerRegistry;
    private final Consumer<Exception> exceptionHandler;
    private final Gson gson;

    private final WebhookEventRegistry eventRegistry;

    public static void main(String[] args) {
        PelicanWebhooks4J webhooks = PelicanWebhooks4J.newInstance();
        webhooks.getListenerRegistry().register(WebhookConfigurationEvent.class, event -> {
            System.out.println("Webhook configuration event:");
            System.out.println(event.getWebhookAction());
            System.out.println(event.getEvent());
            System.out.println(event.getTimestamp());
            System.out.println(event.getData().getScope());
            System.out.println();
        }, EventPriority.LOW);

        webhooks.getListenerRegistry().register(EntityWebhookEvent.class, event -> {
            System.out.println("Entity webhook event:");
            System.out.println(event.getWebhookAction());
            System.out.println(event.getEvent());
            System.out.println(event.getTimestamp());
            System.out.println(event.getData());
            System.out.println();
        });

        webhooks.getListenerRegistry().register(ActivityLoggedEvent.class, event -> {
            System.out.println("Activity logged:");
            System.out.println(event.getWebhookAction());
            System.out.println(event.getDescription());
            System.out.println(event.getIp());
            System.out.println(event.getActor());
            System.out.println(event.getProperties());
            System.out.println(event.getSubjects());
            System.out.println();
        });

        try {
            webhooks.dispatch("{\"event\":\"created: WebhookConfiguration\",\"data\":{\"scope\":\"global\",\"type\":\"regular\",\"payload\":null,\"name\":\"TEst\",\"description\":\"test\",\"endpoint\":\"http:\\/\\/node2.craftsblock.eu:25575\\/webhook\",\"headers\":{\"X-Webhook-WebhookEvent\":\"{{event}}\"},\"events\":[\"App\\\\Events\\\\ActivityLogged\",\"App\\\\Events\\\\User\\\\Deleting\",\"App\\\\Events\\\\User\\\\PasswordChanged\",\"eloquent.created: App\\\\Models\\\\Allocation\",\"eloquent.updated: App\\\\Models\\\\Allocation\",\"eloquent.deleted: App\\\\Models\\\\Allocation\",\"eloquent.created: App\\\\Models\\\\ApiKey\",\"eloquent.updated: App\\\\Models\\\\ApiKey\",\"eloquent.deleted: App\\\\Models\\\\ApiKey\",\"eloquent.created: App\\\\Models\\\\DatabaseHost\",\"eloquent.updated: App\\\\Models\\\\DatabaseHost\",\"eloquent.deleted: App\\\\Models\\\\DatabaseHost\",\"eloquent.created: App\\\\Models\\\\Egg\",\"eloquent.updated: App\\\\Models\\\\Egg\",\"eloquent.deleted: App\\\\Models\\\\Egg\",\"eloquent.created: App\\\\Models\\\\EggVariable\",\"eloquent.updated: App\\\\Models\\\\EggVariable\",\"eloquent.deleted: App\\\\Models\\\\EggVariable\",\"eloquent.created: App\\\\Models\\\\Mount\",\"eloquent.updated: App\\\\Models\\\\Mount\",\"eloquent.deleted: App\\\\Models\\\\Mount\",\"eloquent.created: App\\\\Models\\\\Node\",\"eloquent.updated: App\\\\Models\\\\Node\",\"eloquent.deleted: App\\\\Models\\\\Node\",\"eloquent.created: App\\\\Models\\\\NodeRole\",\"eloquent.updated: App\\\\Models\\\\NodeRole\",\"eloquent.deleted: App\\\\Models\\\\NodeRole\",\"eloquent.created: App\\\\Models\\\\Plugin\",\"eloquent.updated: App\\\\Models\\\\Plugin\",\"eloquent.deleted: App\\\\Models\\\\Plugin\",\"eloquent.created: App\\\\Models\\\\Role\",\"eloquent.updated: App\\\\Models\\\\Role\",\"eloquent.deleted: App\\\\Models\\\\Role\",\"eloquent.created: App\\\\Models\\\\HasAccessTokens\",\"eloquent.updated: App\\\\Models\\\\HasAccessTokens\",\"eloquent.deleted: App\\\\Models\\\\HasAccessTokens\",\"eloquent.created: App\\\\Models\\\\User\",\"eloquent.updated: App\\\\Models\\\\User\",\"eloquent.deleted: App\\\\Models\\\\User\",\"eloquent.updated: App\\\\Models\\\\Webhook\",\"eloquent.deleted: App\\\\Models\\\\Webhook\",\"eloquent.created: App\\\\Models\\\\WebhookConfiguration\",\"eloquent.updated: App\\\\Models\\\\WebhookConfiguration\",\"eloquent.deleted: App\\\\Models\\\\WebhookConfiguration\",\"eloquent.created: App\\\\Models\\\\Server\",\"eloquent.updated: App\\\\Models\\\\Server\",\"eloquent.deleted: App\\\\Models\\\\Server\",\"eloquent.created: App\\\\Models\\\\ServerTransfer\",\"eloquent.updated: App\\\\Models\\\\ServerTransfer\",\"eloquent.deleted: App\\\\Models\\\\ServerTransfer\",\"eloquent.created: App\\\\Models\\\\ServerUserSettings\",\"eloquent.updated: App\\\\Models\\\\ServerUserSettings\",\"eloquent.deleted: App\\\\Models\\\\ServerUserSettings\",\"eloquent.created: App\\\\Models\\\\ServerVariable\",\"eloquent.updated: App\\\\Models\\\\ServerVariable\",\"eloquent.deleted: App\\\\Models\\\\ServerVariable\"],\"updated_at\":\"2026-10-11T12:31:02.000000Z\",\"created_at\":\"2026-10-11T12:31:02.000000Z\",\"id\":1},\"timestamp\":\"2026-10-11T12:31:02+00:00\"}");
            System.out.println("--------------");
            webhooks.dispatch("{\"event\":\"event: User\\\\Deleting\",\"timestamp\":\"2026-10-11T15:31:07+00:00\",\"data\":{\"user\":{\"id\":3,\"external_id\":null,\"is_managed_externally\":false,\"uuid\":\"dbf18fea-10a3-4a0e-90b9-181c4f06ef57\",\"username\":\"test\",\"email\":\"test@test.de\",\"language\":\"en\",\"timezone\":\"UTC\",\"created_at\":\"2026-10-11T15:30:42.000000Z\",\"updated_at\":\"2026-10-11T15:30:42.000000Z\",\"customization\":null,\"mfa_email_enabled\":false}}}");
            System.out.println("--------------");
            webhooks.dispatch("{\"event\":\"auth:success\",\"description\":null,\"ip\":\"132.132.132.132\",\"timestamp\":\"2026-10-11T16:11:00+00:00\",\"actor\":{\"id\":1,\"type\":\"user\",\"username\":\"admin\"},\"properties\":{\"ip\":\"132.132.132.132\",\"useragent\":\"Mozilla\\/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit\\/537.36 (KHTML, like Gecko) Chrome\\/155.0.0.0 Safari\\/537.36\"},\"subjects\":[{\"id\":1,\"type\":\"user\"}]}");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

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
    }

    public void dispatch(String message) {
        try {
            JsonElement json = JsonParser.parseString(message);
            if (!json.isJsonObject()) {
                throw new IllegalArgumentException("The webhook must be a json object");
            }

            String[] eventInfo = json.getAsJsonObject().get("event").getAsString().split(":\\s?", 2);
            WebhookEventAction eventAction = WebhookEventAction.parse(eventInfo[0]);
            String eventName = eventInfo[1];

            Class<? extends GenericWebhookEvent> eventClass = eventRegistry.getEventClass(eventName, eventAction);
            if (eventClass == null) {
                throw new IllegalStateException("No event class found for " + eventName + " and action " + eventAction);
            }

            GenericWebhookEvent event = this.gson.fromJson(json, eventClass);
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
