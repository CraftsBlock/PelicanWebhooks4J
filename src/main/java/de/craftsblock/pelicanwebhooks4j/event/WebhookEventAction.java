package de.craftsblock.pelicanwebhooks4j.event;

public enum WebhookEventAction {

    EVENT("event"),

    CREATED("created"),
    DELETED("deleted"),
    UPDATED("updated"),

    SERVER_ACTIVITY(null);

    private final String identifier;

    WebhookEventAction(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public static WebhookEventAction parse(String state) {
        return switch (state.toLowerCase()) {
            case "event" -> EVENT;
            case "created" -> CREATED;
            case "deleted" -> DELETED;
            case "updated" -> UPDATED;
            default -> SERVER_ACTIVITY;
        };
    }

}
