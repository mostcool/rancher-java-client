package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CinderVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;
    
    @JsonProperty("volumeID")
    private String volumeId;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public LocalObjectReference getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(LocalObjectReference secretRef) {
      this.secretRef = secretRef;
    }
    
    public String getVolumeId() {
        return this.volumeId;
    }

    public void setVolumeId(String volumeId) {
      this.volumeId = volumeId;
    }
    
}
