
package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.Map;

@SuppressWarnings("unused")
public class ServerUserSettings extends TimestampedEntity {

    private int user_id;
    private int server_id;
    private Map<String, Object> settings;
    private Server server;
    private User user;

    public int getUserId() {
        return user_id;
    }

    public int getServerId() {
        return server_id;
    }

    public Map<String, Object> getSettings() {
        return settings;
    }

    public Server getServer() {
        return server;
    }

    public User getUser() {
        return user;
    }

}
