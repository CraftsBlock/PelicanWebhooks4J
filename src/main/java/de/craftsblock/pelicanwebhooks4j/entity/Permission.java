package de.craftsblock.pelicanwebhooks4j.entity;

@SuppressWarnings("unused")
public class Permission extends TimestampedEntity {

    private String name;
    private String guard_name;

    public String getName() {
        return name;
    }

    public String getGuardName() {
        return guard_name;
    }

}