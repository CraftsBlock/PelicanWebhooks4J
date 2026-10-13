
package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;

@SuppressWarnings("unused")
public class ServerTransfer extends TimestampedEntity {

    private int server_id;
    private Boolean successful;
    private int old_node;
    private int new_node;
    private Integer old_allocation;
    private Integer new_allocation;
    private List<Integer> old_additional_allocations;
    private List<Integer> new_additional_allocations;
    private boolean archived;
    private Node newNode;
    private Node oldNode;
    private Server server;

    public int getServerId() {
        return server_id;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public Integer getOldAllocation() {
        return old_allocation;
    }

    public Integer getNewAllocation() {
        return new_allocation;
    }

    public List<Integer> getOldAdditionalAllocations() {
        return old_additional_allocations;
    }

    public List<Integer> getNewAdditionalAllocations() {
        return new_additional_allocations;
    }

    public boolean isArchived() {
        return archived;
    }

    public Node getNewNode() {
        return newNode;
    }

    public Node getOldNode() {
        return oldNode;
    }

    public Server getServer() {
        return server;
    }

}
