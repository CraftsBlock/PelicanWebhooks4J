package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Allocation;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class AllocationEvent extends EntityWebhookEvent<Allocation> {

    private Allocation data;

    @Override
    public Allocation getData() {
        return data;
    }

}
