package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class GlusterfsVolumeSource extends AbstractType {
    
    @JsonProperty("endpoints")
    private String endpoints;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    public String getEndpoints() {
        return this.endpoints;
    }

    public void setEndpoints(String endpoints) {
      this.endpoints = endpoints;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
