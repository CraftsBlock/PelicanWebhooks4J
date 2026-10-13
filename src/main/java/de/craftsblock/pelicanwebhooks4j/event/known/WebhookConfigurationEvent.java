package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.WebhookConfiguration;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class WebhookConfigurationEvent extends EntityWebhookEvent<WebhookConfiguration> {

    private WebhookConfiguration data;

    @Override
    public WebhookConfiguration getData() {
        return data;
    }

}
