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
    private Integer nodes_count;
    private List<Permission> permissions;
    private Integer permissions_count;
    private List<User> users;
    private Integer users_count;

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

    public Integer getNodesCount() {
        return nodes_count;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public Integer getPermissionsCount() {
        return permissions_count;
    }

    public List<User> getUsers() {
        return users;
    }

    public Integer getUsersCount() {
        return users_count;
    }

}
