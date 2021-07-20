package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PersistentVolumeClaimVolumeSource extends AbstractType {
    
    @JsonProperty("persistentVolumeClaimId")
    private String persistentVolumeClaimId;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    public String getPersistentVolumeClaimId() {
        return this.persistentVolumeClaimId;
    }

    public void setPersistentVolumeClaimId(String persistentVolumeClaimId) {
      this.persistentVolumeClaimId = persistentVolumeClaimId;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
