package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Server;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class ServerEvent extends EntityWebhookEvent<Server> {

    private Server data;

    @Override
    public Server getData() {
        return data;
    }

}
