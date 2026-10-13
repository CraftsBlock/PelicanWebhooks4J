
package de.craftsblock.pelicanwebhooks4j.entity;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class EggVariable {

    private int id;
    private int egg_id;
    private String name;
    private String description;
    private String env_variable;
    private String default_value;
    private boolean user_viewable;
    private boolean user_editable;
    private List<String> rules;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
    private Integer sort;
    private Egg egg;
    private boolean required;
    private List<ServerVariable> serverVariable;
    private String server_value;

    public int getId() {
        return id;
    }

    public int getEggId() {
        return egg_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEnvVariable() {
        return env_variable;
    }

    public String getDefaultValue() {
        return default_value;
    }

    public boolean isUserViewable() {
        return user_viewable;
    }

    public boolean isUserEditable() {
        return user_editable;
    }

    public List<String> getRules() {
        return rules;
    }

    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    public OffsetDateTime getUpdatedAt() {
        return updated_at;
    }

    public Integer getSort() {
        return sort;
    }

    public Egg getEgg() {
        return egg;
    }

    public boolean isRequired() {
        return required;
    }

    public List<ServerVariable> getServerVariable() {
        return serverVariable;
    }

    public String getServerValue() {
        return server_value;
    }

}
