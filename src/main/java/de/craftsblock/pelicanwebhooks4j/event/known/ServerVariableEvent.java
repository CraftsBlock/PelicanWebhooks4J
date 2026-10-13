package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.ServerVariable;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class ServerVariableEvent extends EntityWebhookEvent<ServerVariable> {

    private ServerVariable data;

    @Override
    public ServerVariable getData() {
        return data;
    }

}
