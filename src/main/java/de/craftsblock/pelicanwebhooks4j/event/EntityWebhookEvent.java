package de.craftsblock.pelicanwebhooks4j.event;

import de.craftsblock.pelicanwebhooks4j.entity.Entity;

public abstract class EntityWebhookEvent<T extends Entity> extends GenericWebhookEvent {

    public abstract T getData();

}
