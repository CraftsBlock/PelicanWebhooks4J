
package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class Allocation extends TimestampedEntity {

    private int node_id;
    private String ip;
    private Integer ip_alias;
    private int port;
    private String notes;
    private Node node;
    private List<Server> servers;
    private Server server;

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
