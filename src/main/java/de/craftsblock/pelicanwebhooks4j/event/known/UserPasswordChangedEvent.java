package de.craftsblock.pelicanwebhooks4j.event.known;

import de.craftsblock.pelicanwebhooks4j.entity.User;
import de.craftsblock.pelicanwebhooks4j.event.EntityWebhookEvent;

@SuppressWarnings("unused")
public class UserPasswordChangedEvent extends EntityWebhookEvent<User> {

    private DataField data;

    @Override
    public User getData() {
        return data.user;
    }

    private static class DataField {

        User user;

    }

}
