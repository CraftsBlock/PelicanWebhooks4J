
package de.craftsblock.pelicanwebhooks4j.entity;

@SuppressWarnings("unused")
public class Task extends TimestampedEntity {

    private int schedule_id;
    private int sequence_id;
    private String action;
    private String payload;
    private int time_offset;
    private boolean is_queued;
    private boolean continue_on_failure;
    private Schedule schedule;
    private Server server;

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

    public Schedule getSchedule() {
        return schedule;
    }

    public Server getServer() {
        return server;
    }

}
