package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class UpdateGlobalDNSTargetsInput extends AbstractType {
    
    @JsonProperty("projectIds")
    private List<String> projectIds;
    
    public List<String> getProjectIds() {
        return this.projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
      this.projectIds = projectIds;
    }
    
}
