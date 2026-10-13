package de.craftsblock.pelicanwebhooks4j.entity;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class WebhookConfiguration extends TimestampedEntity {

    private String scope;
    private String type;
    private Object payload;
    private String name;
    private String description;
    private String endpoint;
    private Map<String, String> headers;
    private List<String> events;

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

}
