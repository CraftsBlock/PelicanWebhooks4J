package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.ServerTransfer;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class ServerTransferEvent extends EntityWebhookEvent<ServerTransfer> {

    private ServerTransfer data;

    @Override
    public ServerTransfer getData() {
        return data;
    }

}
