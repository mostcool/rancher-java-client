package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PhotonPersistentDiskVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("pdID")
    private String pdId;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getPdId() {
        return this.pdId;
    }

    public void setPdId(String pdId) {
      this.pdId = pdId;
    }
    
}
