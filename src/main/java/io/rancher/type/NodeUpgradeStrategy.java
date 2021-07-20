package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class NodeUpgradeStrategy extends AbstractType {
    
    @JsonProperty("drain")
    private Boolean drain;
    
    @JsonProperty("maxUnavailableControlplane")
    private String maxUnavailableControlplane;
    
    @JsonProperty("maxUnavailableWorker")
    private String maxUnavailableWorker;
    
    @JsonProperty("nodeDrainInput")
    private NodeDrainInput nodeDrainInput;
    
    public Boolean getDrain() {
        return this.drain;
    }

    public void setDrain(Boolean drain) {
      this.drain = drain;
    }
    
    public String getMaxUnavailableControlplane() {
        return this.maxUnavailableControlplane;
    }

    public void setMaxUnavailableControlplane(String maxUnavailableControlplane) {
      this.maxUnavailableControlplane = maxUnavailableControlplane;
    }
    
    public String getMaxUnavailableWorker() {
        return this.maxUnavailableWorker;
    }

    public void setMaxUnavailableWorker(String maxUnavailableWorker) {
      this.maxUnavailableWorker = maxUnavailableWorker;
    }
    
    public NodeDrainInput getNodeDrainInput() {
        return this.nodeDrainInput;
    }

    public void setNodeDrainInput(NodeDrainInput nodeDrainInput) {
      this.nodeDrainInput = nodeDrainInput;
    }
    
}
