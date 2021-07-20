package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class GlobalDnsStatus extends AbstractType {
    
    @JsonProperty("clusterEndpoints")
    private Map<String, Object> clusterEndpoints;
    
    @JsonProperty("endpoints")
    private List<String> endpoints;
    
    public Map<String, Object> getClusterEndpoints() {
        return this.clusterEndpoints;
    }

    public void setClusterEndpoints(Map<String, Object> clusterEndpoints) {
      this.clusterEndpoints = clusterEndpoints;
    }
    
    public List<String> getEndpoints() {
        return this.endpoints;
    }

    public void setEndpoints(List<String> endpoints) {
      this.endpoints = endpoints;
    }
    
}
