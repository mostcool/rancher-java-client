package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RestoreConfig extends AbstractType {
    
    @JsonProperty("restore")
    private Boolean restore;
    
    @JsonProperty("snapshotName")
    private String snapshotName;
    
    public Boolean getRestore() {
        return this.restore;
    }

    public void setRestore(Boolean restore) {
      this.restore = restore;
    }
    
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
      this.snapshotName = snapshotName;
    }
    
}
