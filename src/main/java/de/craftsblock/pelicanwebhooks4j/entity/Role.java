package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class Role extends TimestampedEntity {

    private String name;
    private String guard_name;
    private NodeRole pivot;
    private List<Node> nodes;
    private List<Permission> permissions;
    private List<User> users;

    public String getName() {
        return name;
    }

    public String getGuardName() {
        return guard_name;
    }

    public NodeRole getPivot() {
        return pivot;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public List<User> getUsers() {
        return users;
    }

}
