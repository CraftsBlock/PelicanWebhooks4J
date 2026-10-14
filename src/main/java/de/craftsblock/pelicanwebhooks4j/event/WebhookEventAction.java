package de.craftsblock.pelicanwebhooks4j.event;

import de.craftsblock.pelicanwebhooks4j.event.known.ActivityLoggedEvent;
import org.jetbrains.annotations.NotNull;

public record WebhookEventAction(
        String identifier,
        Class<? extends GenericWebhookEvent> fallbackEventClass,
        boolean activity
) {

    public static final WebhookEventAction EVENT = of("event");

    public static final WebhookEventAction CREATED = of("created");
    public static final WebhookEventAction DELETED = of("deleted");
    public static final WebhookEventAction UPDATED = of("updated");

    public static final WebhookEventAction UNKNOWN_ACTIVITY = of(null, ActivityLoggedEvent.class, true);
    public static final WebhookEventAction AUTH_ACTIVITY = of("auth", ActivityLoggedEvent.class, true);
    public static final WebhookEventAction SERVER_ACTIVITY = of("server", ActivityLoggedEvent.class, true);

    private static WebhookEventAction of(String identifier) {
        return of(identifier, null, false);
    }

    private static WebhookEventAction of(String identifier, Class<? extends GenericWebhookEvent> fallbackEventClass,
                                         boolean activity) {
        return new WebhookEventAction(identifier, fallbackEventClass, activity);
    }

    @Override
    public @NotNull String toString() {
        return identifier;
    }

}
