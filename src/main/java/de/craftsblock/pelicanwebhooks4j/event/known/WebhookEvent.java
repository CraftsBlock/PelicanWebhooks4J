package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Webhook;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class WebhookEvent extends EntityWebhookEvent<Webhook> {

    private Webhook data;

    @Override
    public Webhook getData() {
        return data;
    }

}
