package de.craftsblock.pelicanwebhooks4j.event;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookEventActionRegistry {

    private final Map<String, WebhookEventAction> eventActions;
    private final @NotNull List<String> nonOverridable;
    private final WebhookEventAction unknownActivity;

    public WebhookEventActionRegistry() {
        this.eventActions = new HashMap<>();

        this.register(WebhookEventAction.EVENT);
        this.register(WebhookEventAction.CREATED);
        this.register(WebhookEventAction.UPDATED);
        this.register(WebhookEventAction.DELETED);
        this.register(WebhookEventAction.AUTH_ACTIVITY);
        this.register(WebhookEventAction.SERVER_ACTIVITY);

        this.nonOverridable = List.copyOf(eventActions.keySet());
        this.unknownActivity = WebhookEventAction.UNKNOWN_ACTIVITY;
    }

    public WebhookEventAction register(@NotNull String identifier) {
        return this.register(identifier, null, false);
    }

    public WebhookEventAction register(@NotNull String identifier, @Nullable Class<? extends GenericWebhookEvent> fallbackEventClass,
                                       boolean activity) {
        if (this.nonOverridable.contains(identifier)) {
            throw new IllegalArgumentException("Can't override non overridalbe event action " + identifier);
        }

        return this.register(new WebhookEventAction(identifier, fallbackEventClass, activity));
    }

    private WebhookEventAction register(@NotNull WebhookEventAction action) {
        return this.eventActions.put(action.identifier(), action);
    }

    public WebhookEventAction getEventAction(@NotNull String action) {
        return this.eventActions.getOrDefault(action, this.unknownActivity);
    }

    public Map<String, WebhookEventAction> getEventActions() {
        return Collections.unmodifiableMap(this.eventActions);
    }

    public WebhookEventAction getUnknownActivity() {
        return this.unknownActivity;
    }

}
