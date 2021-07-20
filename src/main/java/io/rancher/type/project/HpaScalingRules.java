package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class HpaScalingRules extends AbstractType {
    
    @JsonProperty("policies")
    private List<HpaScalingPolicy> policies;
    
    @JsonProperty("selectPolicy")
    private String selectPolicy;
    
    @JsonProperty("stabilizationWindowSeconds")
    private Integer stabilizationWindowSeconds;
    
    public List<HpaScalingPolicy> getPolicies() {
        return this.policies;
    }

    public void setPolicies(List<HpaScalingPolicy> policies) {
      this.policies = policies;
    }
    
    public String getSelectPolicy() {
        return this.selectPolicy;
    }

    public void setSelectPolicy(String selectPolicy) {
      this.selectPolicy = selectPolicy;
    }
    
    public Integer getStabilizationWindowSeconds() {
        return this.stabilizationWindowSeconds;
    }

    public void setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
      this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    }
    
}
