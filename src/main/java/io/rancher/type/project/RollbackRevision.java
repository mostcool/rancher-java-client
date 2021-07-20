package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RollbackRevision extends AbstractType {
    
    @JsonProperty("forceUpgrade")
    private Boolean forceUpgrade;
    
    @JsonProperty("revisionId")
    private String revisionId;
    
    public Boolean getForceUpgrade() {
        return this.forceUpgrade;
    }

    public void setForceUpgrade(Boolean forceUpgrade) {
      this.forceUpgrade = forceUpgrade;
    }
    
    public String getRevisionId() {
        return this.revisionId;
    }

    public void setRevisionId(String revisionId) {
      this.revisionId = revisionId;
    }
    
}
