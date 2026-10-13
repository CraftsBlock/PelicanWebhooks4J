
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public class ServerVariable {

    private int id;
    private int server_id;
    private int variable_id;
    private String variable_value;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private Server server;
    private EggVariable variable;

    public int getId() {
        return id;
    }

    public int getServerId() {
        return server_id;
    }

    public int getVariableId() {
        return variable_id;
    }

    public String getVariableValue() {
        return variable_value;
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

    public EggVariable getVariable() {
        return variable;
    }

}
