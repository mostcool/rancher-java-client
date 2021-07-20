package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ArbitraryFSAccessThroughSMsConfig extends AbstractType {
    
    @JsonProperty("deny")
    private Boolean deny;
    
    public Boolean getDeny() {
        return this.deny;
    }

    public void setDeny(Boolean deny) {
      this.deny = deny;
    }
    
}
