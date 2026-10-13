
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public class Task {

    private int id;
    private int schedule_id;
    private int sequence_id;
    private String action;
    private String payload;
    private int time_offset;
    private boolean is_queued;
    private boolean continue_on_failure;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private Schedule schedule;
    private Server server;

    public int getId() {
        return id;
    }

    public int getScheduleId() {
        return schedule_id;
    }

    public int getSequenceId() {
        return sequence_id;
    }

    public String getAction() {
        return action;
    }

    public String getPayload() {
        return payload;
    }

    public int getTimeOffset() {
        return time_offset;
    }

    public boolean isQueued() {
        return is_queued;
    }

    public boolean isContinueOnFailure() {
        return continue_on_failure;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Server getServer() {
        return server;
    }

}
