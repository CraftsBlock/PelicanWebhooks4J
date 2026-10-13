package de.craftsblock.pelicanwebhooks4j.entity;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Plugin implements Entity {

    private String id;
    private String name;
    private String author;
    private String version;
    private String description;
    private String category;
    private String url;
    private String update_url;
    private String namespace;
    @SerializedName("class")
    private String class_name;
    private String panels;
    private String panel_version;
    private Integer api_version;
    private String composer_packages;
    private String status;
    private String status_message;
    private int load_order;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getUrl() {
        return url;
    }

    public String getUpdateUrl() {
        return update_url;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getClassName() {
        return class_name;
    }

    public String getPanels() {
        return panels;
    }

    public String getPanelVersion() {
        return panel_version;
    }

    public Integer getApiVersion() {
        return api_version;
    }

    public String getComposerPackages() {
        return composer_packages;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusMessage() {
        return status_message;
    }

    public int getLoadOrder() {
        return load_order;
    }

}