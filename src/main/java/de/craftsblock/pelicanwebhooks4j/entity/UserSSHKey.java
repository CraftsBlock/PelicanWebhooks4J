package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;

@SuppressWarnings("unused")
public class UserSSHKey extends TimestampedEntity {

    private int user_id;
    private String name;
    private String fingerprint;
    private String public_key;
    private OffsetDateTime deleted_at;
    private User user;

    public int getUserId() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public String getPublicKey() {
        return public_key;
    }

    public OffsetDateTime getDeletedAt() {
        return deleted_at;
    }

    public User getUser() {
        return user;
    }
}