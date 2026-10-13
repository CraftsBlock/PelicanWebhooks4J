
package de.craftsblock.pelicanwebhooks4j.entity;

@SuppressWarnings("unused")
public class ServerVariable extends TimestampedEntity {

    private int server_id;
    private int variable_id;
    private String variable_value;
    private Server server;
    private EggVariable variable;

    public int getServerId() {
        return server_id;
    }

    public int getVariableId() {
        return variable_id;
    }

    public String getVariableValue() {
        return variable_value;
    }

    public Server getServer() {
        return server;
    }

    public EggVariable getVariable() {
        return variable;
    }

}
