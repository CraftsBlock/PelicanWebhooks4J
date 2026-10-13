package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public class Permission {

    private int id;
    private String name;
    private String guard_name;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGuardName() {
        return guard_name;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

}