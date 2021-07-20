package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class EnvVar extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("value")
    private String value;
    
    @JsonProperty("valueFrom")
    private EnvVarSource valueFrom;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
    public EnvVarSource getValueFrom() {
        return this.valueFrom;
    }

    public void setValueFrom(EnvVarSource valueFrom) {
      this.valueFrom = valueFrom;
    }
    
}
