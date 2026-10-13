
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class Schedule extends TimestampedEntity {

    private int server_id;
    private String name;
    private String cron_day_of_week;
    private String cron_month;
    private String cron_day_of_month;
    private String cron_hour;
    private String cron_minute;
    private String timezone;
    private boolean is_active;
    private boolean is_processing;
    private boolean only_when_online;
    private OffsetDateTime last_run_at;
    private OffsetDateTime next_run_at;
    private String status;
    private List<Task> tasks;
    private Server server;

    public int getServerId() {
        return server_id;
    }

    public String getName() {
        return name;
    }

    public String getCronDayOfWeek() {
        return cron_day_of_week;
    }

    public String getCronMonth() {
        return cron_month;
    }

    public String getCronDayOfMonth() {
        return cron_day_of_month;
    }

    public String getCronHour() {
        return cron_hour;
    }

    public String getCronMinute() {
        return cron_minute;
    }

    public String getTimezone() {
        return timezone;
    }

    public boolean isActive() {
        return is_active;
    }

    public boolean isProcessing() {
        return is_processing;
    }

    public boolean isOnlyWhenOnline() {
        return only_when_online;
    }

    public OffsetDateTime getLastRunAt() {
        return last_run_at;
    }

    public OffsetDateTime getNextRunAt() {
        return next_run_at;
    }

    public String getStatus() {
        return status;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Server getServer() {
        return server;
    }

}
