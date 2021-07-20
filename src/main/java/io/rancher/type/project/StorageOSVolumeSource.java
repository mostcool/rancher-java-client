package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StorageOSVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;
    
    @JsonProperty("volumeName")
    private String volumeName;
    
    @JsonProperty("volumeNamespace")
    private String volumeNamespace;
    
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
    
    public String getVolumeName() {
        return this.volumeName;
    }

    public void setVolumeName(String volumeName) {
      this.volumeName = volumeName;
    }
    
    public String getVolumeNamespace() {
        return this.volumeNamespace;
    }

    public void setVolumeNamespace(String volumeNamespace) {
      this.volumeNamespace = volumeNamespace;
    }
    
}
