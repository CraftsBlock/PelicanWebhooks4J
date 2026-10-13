package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.ApiKey;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class ApiKeyEvent extends EntityWebhookEvent<ApiKey> {

    private ApiKey data;

    @Override
    public ApiKey getData() {
        return data;
    }

}
