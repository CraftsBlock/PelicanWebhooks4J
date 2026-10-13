package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public abstract class TimestampedEntity implements Entity {

    private int id;

    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;

    public int getId() {
        return id;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

}
