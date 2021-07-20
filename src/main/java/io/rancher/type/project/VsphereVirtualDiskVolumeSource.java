package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class VsphereVirtualDiskVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("storagePolicyID")
    private String storagePolicyId;
    
    @JsonProperty("storagePolicyName")
    private String storagePolicyName;
    
    @JsonProperty("volumePath")
    private String volumePath;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getStoragePolicyId() {
        return this.storagePolicyId;
    }

    public void setStoragePolicyId(String storagePolicyId) {
      this.storagePolicyId = storagePolicyId;
    }
    
    public String getStoragePolicyName() {
        return this.storagePolicyName;
    }

    public void setStoragePolicyName(String storagePolicyName) {
      this.storagePolicyName = storagePolicyName;
    }
    
    public String getVolumePath() {
        return this.volumePath;
    }

    public void setVolumePath(String volumePath) {
      this.volumePath = volumePath;
    }
    
}
