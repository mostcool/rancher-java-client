package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Capabilities extends AbstractType {
    
    @JsonProperty("ingressCapabilities")
    private List<IngressCapabilities> ingressCapabilities;
    
    @JsonProperty("loadBalancerCapabilities")
    private LoadBalancerCapabilities loadBalancerCapabilities;
    
    @JsonProperty("nodePoolScalingSupported")
    private Boolean nodePoolScalingSupported;
    
    @JsonProperty("nodePortRange")
    private String nodePortRange;
    
    @JsonProperty("pspEnabled")
    private Boolean pspEnabled;
    
    @JsonProperty("taintSupport")
    private Boolean taintSupport;
    
    public List<IngressCapabilities> getIngressCapabilities() {
        return this.ingressCapabilities;
    }

    public void setIngressCapabilities(List<IngressCapabilities> ingressCapabilities) {
      this.ingressCapabilities = ingressCapabilities;
    }
    
    public LoadBalancerCapabilities getLoadBalancerCapabilities() {
        return this.loadBalancerCapabilities;
    }

    public void setLoadBalancerCapabilities(LoadBalancerCapabilities loadBalancerCapabilities) {
      this.loadBalancerCapabilities = loadBalancerCapabilities;
    }
    
    public Boolean getNodePoolScalingSupported() {
        return this.nodePoolScalingSupported;
    }

    public void setNodePoolScalingSupported(Boolean nodePoolScalingSupported) {
      this.nodePoolScalingSupported = nodePoolScalingSupported;
    }
    
    public String getNodePortRange() {
        return this.nodePortRange;
    }

    public void setNodePortRange(String nodePortRange) {
      this.nodePortRange = nodePortRange;
    }
    
    public Boolean getPspEnabled() {
        return this.pspEnabled;
    }

    public void setPspEnabled(Boolean pspEnabled) {
      this.pspEnabled = pspEnabled;
    }
    
    public Boolean getTaintSupport() {
        return this.taintSupport;
    }

    public void setTaintSupport(Boolean taintSupport) {
      this.taintSupport = taintSupport;
    }
    
}
