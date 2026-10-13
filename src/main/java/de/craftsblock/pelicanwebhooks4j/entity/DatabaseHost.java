
package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class DatabaseHost extends TimestampedEntity {

    private String name;
    private String host;
    private int port;
    private String username;
    private Integer max_databases;
    private List<Database> databases;
    private List<Node> nodes;

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public Integer getMaxDatabases() {
        return max_databases;
    }

    public List<Database> getDatabases() {
        return databases;
    }

    public List<Node> getNodes() {
        return nodes;
    }

}
