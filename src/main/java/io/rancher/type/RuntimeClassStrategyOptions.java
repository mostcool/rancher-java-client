package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class RuntimeClassStrategyOptions extends AbstractType {
    
    @JsonProperty("allowedRuntimeClassNames")
    private List<String> allowedRuntimeClassNames;
    
    @JsonProperty("defaultRuntimeClassName")
    private String defaultRuntimeClassName;
    
    public List<String> getAllowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }

    public void setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
      this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    }
    
    public String getDefaultRuntimeClassName() {
        return this.defaultRuntimeClassName;
    }

    public void setDefaultRuntimeClassName(String defaultRuntimeClassName) {
      this.defaultRuntimeClassName = defaultRuntimeClassName;
    }
    
}
