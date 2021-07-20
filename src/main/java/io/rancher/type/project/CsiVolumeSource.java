package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class CsiVolumeSource extends AbstractType {
    
    @JsonProperty("driver")
    private String driver;
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("nodePublishSecretRef")
    private LocalObjectReference nodePublishSecretRef;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("volumeAttributes")
    private Map<String, Object> volumeAttributes;
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public LocalObjectReference getNodePublishSecretRef() {
        return this.nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(LocalObjectReference nodePublishSecretRef) {
      this.nodePublishSecretRef = nodePublishSecretRef;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public Map<String, Object> getVolumeAttributes() {
        return this.volumeAttributes;
    }

    public void setVolumeAttributes(Map<String, Object> volumeAttributes) {
      this.volumeAttributes = volumeAttributes;
    }
    
}
