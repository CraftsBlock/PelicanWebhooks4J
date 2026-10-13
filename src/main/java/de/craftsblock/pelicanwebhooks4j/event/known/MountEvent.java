package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Mount;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class MountEvent extends EntityWebhookEvent<Mount> {

    private Mount data;

    @Override
    public Mount getData() {
        return data;
    }

}
