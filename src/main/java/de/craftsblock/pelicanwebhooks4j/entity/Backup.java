package de.craftsblock.pelicanwebhooks4j.entity;

import com.google.gson.annotations.SerializedName;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public class Backup extends TimestampedEntity {

    private int server_id;
    private String uuid;
    private String name;
    private String ignored_files;
    private Integer backup_host_id;
    private BackupHost backupHost;
    private String checksum;
    private Integer bytes;
    private OffsetDateTime completed_at;
    @SerializedName("is_successful")
    private boolean successful;
    private String upload_id;
    @SerializedName("is_locked")
    private boolean locked;
    @SerializedName("is_scheduled")
    private boolean scheduled;
    private Server server;

    public int getServerId() {
        return server_id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getIgnoredFiles() {
        return ignored_files;
    }

    public Integer getBackupHostId() {
        return backup_host_id;
    }

    public BackupHost getBackupHost() {
        return backupHost;
    }

    public String getChecksum() {
        return checksum;
    }

    public OffsetDateTime getCompletedAt() {
        return completed_at;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getUploadId() {
        return upload_id;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public Server getServer() {
        return server;
    }

}