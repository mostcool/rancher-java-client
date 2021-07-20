package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class ConfigMapVolumeSource extends AbstractType {
    
    @JsonProperty("defaultMode")
    private Integer defaultMode;
    
    @JsonProperty("items")
    private List<KeyToPath> items;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("optional")
    private Boolean optional;
    
    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
      this.defaultMode = defaultMode;
    }
    
    public List<KeyToPath> getItems() {
        return this.items;
    }

    public void setItems(List<KeyToPath> items) {
      this.items = items;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
      this.optional = optional;
    }
    
}
