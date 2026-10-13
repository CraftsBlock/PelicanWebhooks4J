package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.User;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class UserEvent extends EntityWebhookEvent<User> {

    private User data;

    @Override
    public User getData() {
        return data;
    }

}
