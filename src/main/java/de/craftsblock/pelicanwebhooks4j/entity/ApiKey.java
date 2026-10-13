package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class ApiKey extends TimestampedEntity {

    private String token;
    private List<String> allowed_ips;
    private Integer user_id;
    private String memo;
    private String identifier;
    private int key_type;
    private OffsetDateTime last_used_at;
    private OffsetDateTime expires_at;
    private Map<String, Integer> permissions;
    private User user;

    public String getToken() {
        return token;
    }

    public List<String> getAllowedIps() {
        return allowed_ips;
    }

    public Integer getUserId() {
        return user_id;
    }

    public String getMemo() {
        return memo;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getKeyType() {
        return key_type;
    }

    public OffsetDateTime getLastUsedAt() {
        return last_used_at;
    }

    public OffsetDateTime getExpiresAt() {
        return expires_at;
    }

    public Map<String, Integer> getPermissions() {
        return permissions;
    }

    public User getUser() {
        return user;
    }

}