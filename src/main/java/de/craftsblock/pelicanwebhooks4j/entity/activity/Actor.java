package de.craftsblock.pelicanwebhooks4j.entity.activity;

import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class Actor {

    private long id;
    private String type;
    private String username;

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public @Nullable String getUsername() {
        return username;
    }

}
