package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.ServerUserSettings;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class ServerUserSettingsEvent extends EntityWebhookEvent<ServerUserSettings> {

    private ServerUserSettings data;

    @Override
    public ServerUserSettings getData() {
        return data;
    }

}
