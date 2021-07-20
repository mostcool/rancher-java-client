package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class IngressStatus extends AbstractType {
    
    @JsonProperty("loadBalancer")
    private LoadBalancerStatus loadBalancer;
    
    public LoadBalancerStatus getLoadBalancer() {
        return this.loadBalancer;
    }

    public void setLoadBalancer(LoadBalancerStatus loadBalancer) {
      this.loadBalancer = loadBalancer;
    }
    
}
