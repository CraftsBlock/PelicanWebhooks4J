package de.craftsblock.pelicanwebhooks4j.entity.activity;

import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class Actor {

    private Integer id;
    private String type;
    private String username;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public @Nullable String getUsername() {
        return username;
    }

}
