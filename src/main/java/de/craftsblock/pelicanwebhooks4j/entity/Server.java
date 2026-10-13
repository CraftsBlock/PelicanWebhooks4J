
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class Server extends TimestampedEntity {

    private String uuid;
    private String uuid_short;
    private int node_id;
    private String name;
    private int owner_id;
    private int memory;
    private int swap;
    private int disk;
    private int io;
    private int cpu;
    private int egg_id;
    private String startup;
    private Integer allocation_id;
    private String image;
    private String description;
    private boolean skip_scripts;
    private String external_id;
    private Integer database_limit;
    private Integer allocation_limit;
    private String threads;
    private Integer backup_limit;
    private String status;
    private OffsetDateTime installed_at;
    private boolean oom_killer;
    private Map<String, Object> docker_labels;
    private Allocation allocation;
    private List<Allocation> allocations;
    private List<Backup> backups;
    private List<Database> databases;
    private Egg egg;
    private List<EggVariable> eggVariables;
    private String icon;
    private List<Mount> mounts;
    private Node node;
    private List<Schedule> schedules;
    private List<ServerVariable> serverVariables;
    private List<SubUser> subusers;
    private List<ServerUserSettings> userSettings;
    private ServerTransfer transfer;
    private User user;
    private List<EggVariable> variables;

    public String getUuid() {
        return uuid;
    }

    public String getUuidShort() {
        return uuid_short;
    }

    public int getNodeId() {
        return node_id;
    }

    public String getName() {
        return name;
    }

    public int getOwnerId() {
        return owner_id;
    }

    public int getMemory() {
        return memory;
    }

    public int getSwap() {
        return swap;
    }

    public int getDisk() {
        return disk;
    }

    public int getIo() {
        return io;
    }

    public int getCpu() {
        return cpu;
    }

    public int getEggId() {
        return egg_id;
    }

    public String getStartup() {
        return startup;
    }

    public Integer getAllocationId() {
        return allocation_id;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSkipScripts() {
        return skip_scripts;
    }

    public String getExternalId() {
        return external_id;
    }

    public Integer getDatabaseLimit() {
        return database_limit;
    }

    public Integer getAllocationLimit() {
        return allocation_limit;
    }

    public String getThreads() {
        return threads;
    }

    public Integer getBackupLimit() {
        return backup_limit;
    }

    public String getStatus() {
        return status;
    }

    public OffsetDateTime getInstalledAt() {
        return installed_at;
    }

    public boolean isOomKiller() {
        return oom_killer;
    }

    public Map<String, Object> getDockerLabels() {
        return docker_labels;
    }

    public Allocation getAllocation() {
        return allocation;
    }

    public List<Allocation> getAllocations() {
        return allocations;
    }

    public List<Backup> getBackups() {
        return backups;
    }

    public List<Database> getDatabases() {
        return databases;
    }

    public Egg getEgg() {
        return egg;
    }

    public List<EggVariable> getEggVariables() {
        return eggVariables;
    }

    public String getIcon() {
        return icon;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public Node getNode() {
        return node;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public List<ServerVariable> getServerVariables() {
        return serverVariables;
    }

    public List<SubUser> getSubusers() {
        return subusers;
    }

    public List<ServerUserSettings> getUserSettings() {
        return userSettings;
    }

    public ServerTransfer getTransfer() {
        return transfer;
    }

    public User getUser() {
        return user;
    }

    public List<EggVariable> getVariables() {
        return variables;
    }

}
