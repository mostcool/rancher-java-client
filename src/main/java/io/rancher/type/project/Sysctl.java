package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sysctl extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("value")
    private String value;
    
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
    
}
