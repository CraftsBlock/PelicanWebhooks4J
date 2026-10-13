package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class Mount implements Entity {

    private int id;
    private String uuid;
    private String name;
    private String description;
    private String source;
    private String target;
    private boolean read_only;
    private boolean user_mountable;
    private List<Egg> eggs;
    private List<Node> nodes;
    private List<Server> servers;

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

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Server> getServers() {
        return servers;
    }

}