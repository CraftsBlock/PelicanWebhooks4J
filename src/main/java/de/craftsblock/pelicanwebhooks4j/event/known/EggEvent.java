package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Egg;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class EggEvent extends EntityWebhookEvent<Egg> {

    private Egg data;

    @Override
    public Egg getData() {
        return data;
    }

}
