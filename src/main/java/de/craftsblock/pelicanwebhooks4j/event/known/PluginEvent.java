package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Plugin;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class PluginEvent extends EntityWebhookEvent<Plugin> {

    private Plugin data;

    @Override
    public Plugin getData() {
        return data;
    }

}
