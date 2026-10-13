package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class Role {

    private int id;
    private String name;
    private String guard_name;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private NodeRole pivot;
    private List<Node> nodes;
    private List<Permission> permissions;
    private List<User> users;

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
