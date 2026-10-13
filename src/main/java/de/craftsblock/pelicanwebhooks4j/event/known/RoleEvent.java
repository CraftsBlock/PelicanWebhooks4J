package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.Role;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

public class RoleEvent extends EntityWebhookEvent<Role> {

    private Role data;

    @Override
    public Role getData() {
        return data;
    }

}
