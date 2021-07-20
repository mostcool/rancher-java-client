package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClusterMetricNamesInput extends AbstractType {
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
}
