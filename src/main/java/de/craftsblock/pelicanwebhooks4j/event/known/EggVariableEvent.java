package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.EggVariable;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class EggVariableEvent extends EntityWebhookEvent<EggVariable> {

    private EggVariable data;

    @Override
    public EggVariable getData() {
        return data;
    }

}
