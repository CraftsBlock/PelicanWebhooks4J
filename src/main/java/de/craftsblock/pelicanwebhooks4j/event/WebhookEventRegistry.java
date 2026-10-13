package de.craftsblock.pelicanwebhooks4j.event;

import de.craftsblock.pelicanwebhooks4j.event.known.ActivityLoggedEvent;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class WebhookEventRegistry {

    private final Map<String, EnumMap<WebhookEventAction, Class<? extends GenericWebhookEvent>>> eventClasses = new HashMap<>();

    public WebhookEventRegistry() {
        KnownWebhookEvent.registerAll(this);
    }

    public Class<? extends GenericWebhookEvent> register(@NotNull String name, @NotNull WebhookEventAction action,
                                                         @NotNull Class<? extends GenericWebhookEvent> eventClass) {
        return eventClasses.computeIfAbsent(name.toLowerCase(), n -> new EnumMap<>(WebhookEventAction.class))
                .put(action, eventClass);
    }

    public Class<? extends GenericWebhookEvent> getEventClass(@NotNull String name, @NotNull WebhookEventAction action) {
        var eventActions = eventClasses.get(name.toLowerCase());
        if (eventActions == null) {
            return action == WebhookEventAction.SERVER_ACTIVITY ? ActivityLoggedEvent.class : null;
        }

        var eventClass = eventActions.get(action);
        if (eventClass == null) {
            return action == WebhookEventAction.SERVER_ACTIVITY ? ActivityLoggedEvent.class : null;
        }

        return eventClass;
    }

}
