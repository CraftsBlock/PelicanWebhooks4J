
package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class SubUser extends TimestampedEntity {

    private int user_id;
    private int server_id;
    private List<String> permissions;
    private Server server;
    private User user;

    public int getUserId() {
        return user_id;
    }

    public int getServerId() {
        return server_id;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public Server getServer() {
        return server;
    }

    public User getUser() {
        return user;
    }

}
