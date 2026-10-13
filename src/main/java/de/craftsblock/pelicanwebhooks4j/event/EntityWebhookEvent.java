package de.craftsblock.pelicanwebhooks4j.event;

public abstract class EntityWebhookEvent<T> extends GenericWebhookEvent {

    public abstract T getData();

}
