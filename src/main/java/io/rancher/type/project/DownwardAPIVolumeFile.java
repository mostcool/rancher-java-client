package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DownwardAPIVolumeFile extends AbstractType {
    
    @JsonProperty("fieldRef")
    private ObjectFieldSelector fieldRef;
    
    @JsonProperty("mode")
    private Integer mode;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("resourceFieldRef")
    private ResourceFieldSelector resourceFieldRef;
    
    public ObjectFieldSelector getFieldRef() {
        return this.fieldRef;
    }

    public void setFieldRef(ObjectFieldSelector fieldRef) {
      this.fieldRef = fieldRef;
    }
    
    public Integer getMode() {
        return this.mode;
    }

    public void setMode(Integer mode) {
      this.mode = mode;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public ResourceFieldSelector getResourceFieldRef() {
        return this.resourceFieldRef;
    }

    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
      this.resourceFieldRef = resourceFieldRef;
    }
    
}
