package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class Egg {

    private int id;
    private String uuid;
    private String name;
    private String description;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;

    private Integer config_from;
    private String config_stop;
    private String config_logs;
    private String config_startup;
    private String config_files;

    private String script_install;
    private boolean script_is_privileged;
    private String script_entry;
    private String script_container;
    private Integer copy_script_from;

    private String author;
    private List<String> features;
    private Map<String, String> docker_images;
    private String update_url;
    private List<String> file_denylist;
    private boolean force_outgoing_ip;
    private List<String> tags;
    private Map<String, String> startup_commands;

    private List<Egg> children;

    private Egg configFrom;
    private Egg scriptFrom;

    private String copy_script_container;
    private String copy_script_entry;
    private String copy_script_install;

    private String icon;

    private String inherit_config_files;
    private String inherit_config_logs;
    private String inherit_config_startup;
    private String inherit_config_stop;
    private List<String> inherit_features;
    private List<String> inherit_file_denylist;

    private List<Mount> mounts;
    private List<Server> servers;
    private Map<String, EggVariable> variables;

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public Integer getConfigFromId() {
        return config_from;
    }

    public String getConfigStop() {
        return config_stop;
    }

    public String getConfigLogs() {
        return config_logs;
    }

    public String getConfigStartup() {
        return config_startup;
    }

    public String getConfigFiles() {
        return config_files;
    }

    public String getScriptInstall() {
        return script_install;
    }

    public boolean isScriptPrivileged() {
        return script_is_privileged;
    }

    public String getScriptEntry() {
        return script_entry;
    }

    public String getScriptContainer() {
        return script_container;
    }

    public Integer getCopyScriptFromId() {
        return copy_script_from;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getFeatures() {
        return features;
    }

    public Map<String, String> getDockerImages() {
        return docker_images;
    }

    public String getUpdateUrl() {
        return update_url;
    }

    public List<String> getFileDenylist() {
        return file_denylist;
    }

    public boolean isForceOutgoingIp() {
        return force_outgoing_ip;
    }

    public List<String> getTags() {
        return tags;
    }

    public Map<String, String> getStartupCommands() {
        return startup_commands;
    }

    public List<Egg> getChildren() {
        return children;
    }

    public Egg getConfigFrom() {
        return configFrom;
    }

    public Egg getScriptFrom() {
        return scriptFrom;
    }

    public String getCopyScriptContainer() {
        return copy_script_container;
    }

    public String getCopyScriptEntry() {
        return copy_script_entry;
    }

    public String getCopyScriptInstall() {
        return copy_script_install;
    }

    public String getIcon() {
        return icon;
    }

    public String getInheritConfigFiles() {
        return inherit_config_files;
    }

    public String getInheritConfigLogs() {
        return inherit_config_logs;
    }

    public String getInheritConfigStartup() {
        return inherit_config_startup;
    }

    public String getInheritConfigStop() {
        return inherit_config_stop;
    }

    public List<String> getInheritFeatures() {
        return inherit_features;
    }

    public List<String> getInheritFileDenylist() {
        return inherit_file_denylist;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public List<Server> getServers() {
        return servers;
    }

    public Map<String, EggVariable> getVariables() {
        return variables;
    }

}