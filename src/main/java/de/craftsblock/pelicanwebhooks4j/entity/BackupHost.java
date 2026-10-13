
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class BackupHost {

    private int id;
    private String name;
    private String schema;
    private Map<String, Object> configuration;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private List<Node> nodes;
    private Integer nodes_count;
    private List<Backup> backups;
    private Integer backups_count;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchema() {
        return schema;
    }

    public Map<String, Object> getConfiguration() {
        return configuration;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Integer getNodesCount() {
        return nodes_count;
    }

    public List<Backup> getBackups() {
        return backups;
    }

    public Integer getBackupsCount() {
        return backups_count;
    }
}
