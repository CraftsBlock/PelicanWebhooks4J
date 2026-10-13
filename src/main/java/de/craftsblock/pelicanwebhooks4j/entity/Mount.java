package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class Mount {

    private int id;
    private String uuid;
    private String name;
    private String description;
    private String source;
    private String target;
    private boolean read_only;
    private boolean user_mountable;
    private List<Egg> eggs;
    private Integer eggs_count;
    private List<Node> nodes;
    private Integer nodes_count;
    private List<Server> servers;
    private Integer servers_count;

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public boolean isReadOnly() {
        return read_only;
    }

    public boolean isUserMountable() {
        return user_mountable;
    }

    public List<Egg> getEggs() {
        return eggs;
    }

    public Integer getEggsCount() {
        return eggs_count;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Integer getNodesCount() {
        return nodes_count;
    }

    public List<Server> getServers() {
        return servers;
    }

    public Integer getServersCount() {
        return servers_count;
    }

}