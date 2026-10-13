
package de.craftsblock.pelicanwebhooks4j.entity;

@SuppressWarnings("unused")
public class Database extends TimestampedEntity {

    private int server_id;
    private int database_host_id;
    private String database;
    private String username;
    private String remote;
    private int max_connections;
    private DatabaseHost host;
    private String jdbc;
    private Server server;

    public int getServerId() {
        return server_id;
    }

    public int getDatabaseHostId() {
        return database_host_id;
    }

    public String getDatabase() {
        return database;
    }

    public String getUsername() {
        return username;
    }

    public String getRemote() {
        return remote;
    }

    public int getMaxConnections() {
        return max_connections;
    }

    public DatabaseHost getHost() {
        return host;
    }

    public String getJdbc() {
        return jdbc;
    }

    public Server getServer() {
        return server;
    }

}
