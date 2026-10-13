package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class WebhookConfiguration {

    private String scope;
    private String type;
    private Object payload;
    private String name;
    private String description;
    private String endpoint;
    private Map<String, String> headers;
    private List<String> events;
    private OffsetDateTime updated_at;
    private OffsetDateTime created_at;
    private int id;

    public String getScope() {
        return scope;
    }

    public String getType() {
        return type;
    }

    public Object getPayload() {
        return payload;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public List<String> getEvents() {
        return events;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public int getId() {
        return id;
    }

}
