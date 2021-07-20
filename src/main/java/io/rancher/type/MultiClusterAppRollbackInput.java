package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class MultiClusterAppRollbackInput extends AbstractType {
    
    @JsonProperty("revisionId")
    private String revisionId;
    
    public String getRevisionId() {
        return this.revisionId;
    }

    public void setRevisionId(String revisionId) {
      this.revisionId = revisionId;
    }
    
}
