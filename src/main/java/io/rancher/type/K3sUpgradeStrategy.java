package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class K3sUpgradeStrategy extends AbstractType {
    
    @JsonProperty("drainServerNodes")
    private Boolean drainServerNodes;
    
    @JsonProperty("drainWorkerNodes")
    private Boolean drainWorkerNodes;
    
    @JsonProperty("serverConcurrency")
    private Integer serverConcurrency;
    
    @JsonProperty("workerConcurrency")
    private Integer workerConcurrency;
    
    public Boolean getDrainServerNodes() {
        return this.drainServerNodes;
    }

    public void setDrainServerNodes(Boolean drainServerNodes) {
      this.drainServerNodes = drainServerNodes;
    }
    
    public Boolean getDrainWorkerNodes() {
        return this.drainWorkerNodes;
    }

    public void setDrainWorkerNodes(Boolean drainWorkerNodes) {
      this.drainWorkerNodes = drainWorkerNodes;
    }
    
    public Integer getServerConcurrency() {
        return this.serverConcurrency;
    }

    public void setServerConcurrency(Integer serverConcurrency) {
      this.serverConcurrency = serverConcurrency;
    }
    
    public Integer getWorkerConcurrency() {
        return this.workerConcurrency;
    }

    public void setWorkerConcurrency(Integer workerConcurrency) {
      this.workerConcurrency = workerConcurrency;
    }
    
}
