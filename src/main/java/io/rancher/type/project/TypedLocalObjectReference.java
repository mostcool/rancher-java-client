package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class TypedLocalObjectReference extends AbstractType {
    
    @JsonProperty("apiGroup")
    private String apiGroup;
    
    @JsonProperty("kind")
    private String kind;
    
    @JsonProperty("name")
    private String name;
    
    public String getApiGroup() {
        return this.apiGroup;
    }

    public void setApiGroup(String apiGroup) {
      this.apiGroup = apiGroup;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
