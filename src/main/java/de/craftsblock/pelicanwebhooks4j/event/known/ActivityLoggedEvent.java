package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.activity.Actor;
import de.craftsblock.pelicanwebhooks4j.entity.activity.Subject;
import de.craftsblock.pelicanwebhooks4j.event.GenericWebhookEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class ActivityLoggedEvent extends GenericWebhookEvent {

    private String description;
    private String ip;
    private Actor actor;
    private Map<String, Object> properties;
    private List<Subject> subjects;

    public String getDescription() {
        return description;
    }

    public String getIp() {
        return ip;
    }

    public @Nullable Actor getActor() {
        return actor;
    }

    public @Nullable Map<String, Object> getProperties() {
        return properties;
    }

    public @Nullable List<Subject> getSubjects() {
        return subjects;
    }

}
