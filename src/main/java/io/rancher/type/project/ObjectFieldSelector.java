package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ObjectFieldSelector extends AbstractType {
    
    @JsonProperty("apiVersion")
    private String apiVersion;
    
    @JsonProperty("fieldPath")
    private String fieldPath;
    
    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
    }
    
    public String getFieldPath() {
        return this.fieldPath;
    }

    public void setFieldPath(String fieldPath) {
      this.fieldPath = fieldPath;
    }
    
}
