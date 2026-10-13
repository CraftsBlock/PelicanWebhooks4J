
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class Node {

    private int id;
    private boolean public_node;
    private String name;
    private String fqdn;
    private String scheme;
    private int memory;
    private int memory_overallocate;
    private int disk;
    private int disk_overallocate;
    private int cpu;
    private int cpu_overallocate;
    private int daemon_listen;
    private int daemon_sftp;
    private String daemon_base;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private int upload_size;
    private boolean behind_proxy;
    private String description;
    private boolean maintenance_mode;
    private String uuid;
    private String daemon_sftp_alias;
    private int daemon_connect;
    private List<String> tags;
    private List<Allocation> allocations;
    private Integer allocations_count;
    private List<DatabaseHost> databaseHosts;
    private Integer database_hosts_count;
    private List<Mount> mounts;
    private Integer mounts_count;
    private List<Role> roles;
    private Integer roles_count;
    private List<Server> servers;
    private Integer servers_count;
    private List<BackupHost> backupHosts;
    private Integer backup_hosts_count;
    private Integer servers_sum_memory;
    private Integer servers_sum_disk;
    private Integer servers_sum_cpu;

    public int getId() {
        return id;
    }

    public boolean isPublicNode() {
        return public_node;
    }

    public String getName() {
        return name;
    }

    public String getFqdn() {
        return fqdn;
    }

    public String getScheme() {
        return scheme;
    }

    public int getMemory() {
        return memory;
    }

    public int getMemoryOverallocate() {
        return memory_overallocate;
    }

    public int getDisk() {
        return disk;
    }

    public int getDiskOverallocate() {
        return disk_overallocate;
    }

    public int getCpu() {
        return cpu;
    }

    public int getCpuOverallocate() {
        return cpu_overallocate;
    }

    public int getDaemonListen() {
        return daemon_listen;
    }

    public int getDaemonSftp() {
        return daemon_sftp;
    }

    public String getDaemonBase() {
        return daemon_base;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public int getUploadSize() {
        return upload_size;
    }

    public boolean isBehindProxy() {
        return behind_proxy;
    }

    public String getDescription() {
        return description;
    }

    public boolean isMaintenanceMode() {
        return maintenance_mode;
    }

    public String getUuid() {
        return uuid;
    }

    public String getDaemonSftpAlias() {
        return daemon_sftp_alias;
    }

    public int getDaemonConnect() {
        return daemon_connect;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Allocation> getAllocations() {
        return allocations;
    }

    public Integer getAllocationsCount() {
        return allocations_count;
    }

    public List<DatabaseHost> getDatabaseHosts() {
        return databaseHosts;
    }

    public Integer getDatabaseHostsCount() {
        return database_hosts_count;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public Integer getMountsCount() {
        return mounts_count;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public Integer getRolesCount() {
        return roles_count;
    }

    public List<Server> getServers() {
        return servers;
    }

    public Integer getServersCount() {
        return servers_count;
    }

    public List<BackupHost> getBackupHosts() {
        return backupHosts;
    }

    public Integer getBackupHostsCount() {
        return backup_hosts_count;
    }

    public Integer getServersSumMemory() {
        return servers_sum_memory;
    }

    public Integer getServersSumDisk() {
        return servers_sum_disk;
    }

    public Integer getServersSumCpu() {
        return servers_sum_cpu;
    }

}
