
package de.craftsblock.pelicanwebhooks4j.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class User extends TimestampedEntity {

    private String uuid;
    private String email;
    private String language;
    private String username;
    private String external_id;
    private String timezone;
    private boolean mfa_email_enabled;
    @SerializedName("is_managed_externally")
    private boolean managedExternally;
    private Map<String, Object> customization;
    private List<Server> servers;
    private List<ApiKey> apiKeys;
    private List<UserSSHKey> sshKeys;
    private List<Server> subServers;
    private List<SubUser> subusers;
    private List<ServerUserSettings> serverSettings;
    private List<Role> roles;
    private List<Permission> permissions;

    public String getUuid() {
        return uuid;
    }

    public String getEmail() {
        return email;
    }

    public String getLanguage() {
        return language;
    }

    public String getUsername() {
        return username;
    }

    public String getExternalId() {
        return external_id;
    }

    public String getTimezone() {
        return timezone;
    }

    public boolean isMfaEmailEnabled() {
        return mfa_email_enabled;
    }

    public boolean isManagedExternally() {
        return managedExternally;
    }

    public Map<String, Object> getCustomization() {
        return customization;
    }

    public List<Server> getServers() {
        return servers;
    }

    public List<ApiKey> getApiKeys() {
        return apiKeys;
    }

    public List<UserSSHKey> getSshKeys() {
        return sshKeys;
    }

    public List<Server> getSubServers() {
        return subServers;
    }

    public List<SubUser> getSubusers() {
        return subusers;
    }

    public List<ServerUserSettings> getServerSettings() {
        return serverSettings;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

}
