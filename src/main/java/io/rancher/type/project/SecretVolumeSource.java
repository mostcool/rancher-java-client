package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class SecretVolumeSource extends AbstractType {
    
    @JsonProperty("defaultMode")
    private Integer defaultMode;
    
    @JsonProperty("items")
    private List<KeyToPath> items;
    
    @JsonProperty("optional")
    private Boolean optional;
    
    @JsonProperty("secretName")
    private String secretName;
    
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
    
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
      this.optional = optional;
    }
    
    public String getSecretName() {
        return this.secretName;
    }

    public void setSecretName(String secretName) {
      this.secretName = secretName;
    }
    
}
