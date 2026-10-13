
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.Map;

@SuppressWarnings("unused")
public class Webhook extends TimestampedEntity {

    private int webhook_configuration_id;
    private String event;
    private String endpoint;
    private OffsetDateTime successful_at;
    private Map<String, Object> payload;

    public int getWebhookConfigurationId() {
        return webhook_configuration_id;
    }

    public String getEvent() {
        return event;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public OffsetDateTime getSuccessfulAt() {
        return successful_at;
    }

    public Map<String, Object> getPayload() {
        return payload;
    }

}
