
package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class BackupHost extends TimestampedEntity {

    private String name;
    private String schema;
    private Map<String, Object> configuration;
    private List<Node> nodes;
    private List<Backup> backups;

    public String getName() {
        return name;
    }

    public String getSchema() {
        return schema;
    }

    public Map<String, Object> getConfiguration() {
        return configuration;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Backup> getBackups() {
        return backups;
    }

}
