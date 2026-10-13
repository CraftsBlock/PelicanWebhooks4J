
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class SubUser {

    private int id;
    private int user_id;
    private int server_id;
    private List<String> permissions;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private Server server;
    private User user;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return user_id;
    }

    public int getServerId() {
        return server_id;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public Server getServer() {
        return server;
    }

    public User getUser() {
        return user;
    }

}
