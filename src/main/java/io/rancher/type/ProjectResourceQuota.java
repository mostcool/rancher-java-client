package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ProjectResourceQuota extends AbstractType {
    
    @JsonProperty("limit")
    private ResourceQuotaLimit limit;
    
    @JsonProperty("usedLimit")
    private ResourceQuotaLimit usedLimit;
    
    public ResourceQuotaLimit getLimit() {
        return this.limit;
    }

    public void setLimit(ResourceQuotaLimit limit) {
      this.limit = limit;
    }
    
    public ResourceQuotaLimit getUsedLimit() {
        return this.usedLimit;
    }

    public void setUsedLimit(ResourceQuotaLimit usedLimit) {
      this.usedLimit = usedLimit;
    }
    
}
