
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class Allocation {

    private int id;
    private int node_id;
    private String ip;
    private Integer ip_alias;
    private int port;
    private String notes;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private Node node;
    private List<Server> servers;
    private Server server;

    public int getId() {
        return id;
    }

    public int getNodeId() {
        return node_id;
    }

    public String getIp() {
        return ip;
    }

    public Integer getIpAlias() {
        return ip_alias;
    }

    public int getPort() {
        return port;
    }

    public String getNotes() {
        return notes;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public Node getNode() {
        return node;
    }

    public List<Server> getServers() {
        return servers;
    }

    public Server getServer() {
        return server;
    }

}
