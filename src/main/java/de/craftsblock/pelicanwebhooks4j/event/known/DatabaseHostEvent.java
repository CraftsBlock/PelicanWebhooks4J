package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.DatabaseHost;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class DatabaseHostEvent extends EntityWebhookEvent<DatabaseHost> {

    private DatabaseHost data;

    @Override
    public DatabaseHost getData() {
        return data;
    }

}
