package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PortworxVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
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
    
    public String getVolumeId() {
        return this.volumeId;
    }

    public void setVolumeId(String volumeId) {
      this.volumeId = volumeId;
    }
    
}
