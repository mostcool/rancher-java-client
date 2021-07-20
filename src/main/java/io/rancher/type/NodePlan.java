package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class NodePlan extends AbstractType {
    
    @JsonProperty("agentCheckInterval")
    private Integer agentCheckInterval;
    
    @JsonProperty("plan")
    private RkeConfigNodePlan plan;
    
    @JsonProperty("version")
    private Integer version;
    
    public Integer getAgentCheckInterval() {
        return this.agentCheckInterval;
    }

    public void setAgentCheckInterval(Integer agentCheckInterval) {
      this.agentCheckInterval = agentCheckInterval;
    }
    
    public RkeConfigNodePlan getPlan() {
        return this.plan;
    }

    public void setPlan(RkeConfigNodePlan plan) {
      this.plan = plan;
    }
    
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
      this.version = version;
    }
    
}
