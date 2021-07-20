package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecretEnvSource extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("optional")
    private Boolean optional;
    
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
