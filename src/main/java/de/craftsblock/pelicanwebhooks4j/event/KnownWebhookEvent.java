package de.craftsblock.pelicanwebhooks4j.event;

import de.craftsblock.pelicanwebhooks4j.event.known.*;

import java.util.List;

public enum KnownWebhookEvent {

    ACTIVITY_LOGGED("ActivityLogged", ActivityLoggedEvent.class),

    ALLOCATION("Allocation", AllocationEvent.class),

    API_KEY("ApiKey", ApiKeyEvent.class),

    DATABASE_HOST("DatabaseHost", DatabaseHostEvent.class),

    EGG("Egg", EggEvent.class),
    EGG_VARIABLE("EggVariable", EggVariableEvent.class),

    MOUNT("Mount", MountEvent.class),

    NODE("Node", NodeEvent.class),
    NODE_ROLE("NodeRole", NodeRoleEvent.class),

    PLUGIN("Plugin", PluginEvent.class),

    ROLE("Role", RoleEvent.class),

    SERVER("Server", ServerEvent.class),
    SERVER_TRANSFER("ServerTransfer", ServerTransferEvent.class),
    SERVER_USER_SETTINGS("ServerUserSettings", ServerUserSettingsEvent.class),
    SERVER_VARIABLE("ServerVariable", ServerVariableEvent.class),

    USER("User", UserEvent.class),
    USER_DELETING("User\\Deleting", UserDeletingEvent.class, WebhookEventAction.EVENT),
    USER_PASSWORD_CHANGED("User\\PasswordChanged", UserPasswordChangedEvent.class, WebhookEventAction.EVENT),

    WEBHOOK("Webhook", WebhookEvent.class),
    WEBHOOK_CONFIGURATION("WebhookConfiguration", WebhookConfigurationEvent.class),
    ;

    private final String name;
    private final Class<? extends GenericWebhookEvent> eventClass;
    private final List<WebhookEventAction> actions;

    KnownWebhookEvent(String name, Class<? extends GenericWebhookEvent> eventClass, WebhookEventAction... actions) {
        this(name, eventClass, List.of(actions));
    }

    KnownWebhookEvent(String name, Class<? extends GenericWebhookEvent> eventClass, List<WebhookEventAction> actions) {
        this.name = name;
        this.eventClass = eventClass;
        this.actions = actions.isEmpty()
                ? List.of(WebhookEventAction.CREATED, WebhookEventAction.DELETED, WebhookEventAction.UPDATED)
                : actions;
    }

    public String getName() {
        return name;
    }

    public Class<? extends GenericWebhookEvent> getEventClass() {
        return eventClass;
    }

    public List<WebhookEventAction> getActions() {
        return actions;
    }

    static void registerAll(WebhookEventRegistry eventRegistry) {
        for (KnownWebhookEvent event : KnownWebhookEvent.values()) {
            String eventName = event.getName();
            Class<? extends GenericWebhookEvent> eventClass = event.getEventClass();

            for (WebhookEventAction action : event.getActions()) {
                eventRegistry.register(eventName, action, eventClass);
            }
        }
    }

}
