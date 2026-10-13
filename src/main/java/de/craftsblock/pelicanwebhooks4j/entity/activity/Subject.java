package de.craftsblock.pelicanwebhooks4j.entity.activity;

import de.craftsblock.pelicanwebhooks4j.entity.Entity;

@SuppressWarnings("unused")
public class Subject implements Entity {

    private Integer id;
    private String type;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

}
