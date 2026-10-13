package de.craftsblock.pelicanwebhooks4j.event;

import de.craftsblock.craftscore.event.Event;
import org.jetbrains.annotations.ApiStatus;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public class GenericWebhookEvent extends Event {

    private transient WebhookEventAction webhookEventAction;

    private String event;
    private OffsetDateTime timestamp;

    public String getEvent() {
        return event;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @ApiStatus.Internal
    public void setWebhookAction(WebhookEventAction webhookEventAction) {
        if (this.webhookEventAction == null) {
            this.webhookEventAction = webhookEventAction;
        }
    }

    public final WebhookEventAction getWebhookAction() {
        return webhookEventAction;
    }

}
