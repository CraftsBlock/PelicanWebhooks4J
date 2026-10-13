
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class DatabaseHost {

    private int id;
    private String name;
    private String host;
    private int port;
    private String username;
    private Integer max_databases;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private List<Database> databases;
    private Integer databases_count;
    private List<Node> nodes;
    private Integer nodes_count;

    public int getId() {
        return id;
    }

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

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public List<Database> getDatabases() {
        return databases;
    }

    public Integer getDatabasesCount() {
        return databases_count;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Integer getNodesCount() {
        return nodes_count;
    }

}
