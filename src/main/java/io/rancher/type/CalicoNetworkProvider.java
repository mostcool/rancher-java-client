package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CalicoNetworkProvider extends AbstractType {
    
    @JsonProperty("cloudProvider")
    private String cloudProvider;
    
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public void setCloudProvider(String cloudProvider) {
      this.cloudProvider = cloudProvider;
    }
    
}
