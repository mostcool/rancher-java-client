package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class LoadBalancerStatus extends AbstractType {
    
    @JsonProperty("ingress")
    private List<LoadBalancerIngress> ingress;
    
    public List<LoadBalancerIngress> getIngress() {
        return this.ingress;
    }

    public void setIngress(List<LoadBalancerIngress> ingress) {
      this.ingress = ingress;
    }
    
}
