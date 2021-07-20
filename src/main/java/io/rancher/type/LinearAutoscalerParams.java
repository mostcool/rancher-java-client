package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class LinearAutoscalerParams extends AbstractType {
    
    @JsonProperty("coresPerReplica")
    private Float coresPerReplica;
    
    @JsonProperty("max")
    private Integer max;
    
    @JsonProperty("min")
    private Integer min;
    
    @JsonProperty("nodesPerReplica")
    private Float nodesPerReplica;
    
    @JsonProperty("preventSinglePointFailure")
    private Boolean preventSinglePointFailure;
    
    public Float getCoresPerReplica() {
        return this.coresPerReplica;
    }

    public void setCoresPerReplica(Float coresPerReplica) {
      this.coresPerReplica = coresPerReplica;
    }
    
    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
      this.max = max;
    }
    
    public Integer getMin() {
        return this.min;
    }

    public void setMin(Integer min) {
      this.min = min;
    }
    
    public Float getNodesPerReplica() {
        return this.nodesPerReplica;
    }

    public void setNodesPerReplica(Float nodesPerReplica) {
      this.nodesPerReplica = nodesPerReplica;
    }
    
    public Boolean getPreventSinglePointFailure() {
        return this.preventSinglePointFailure;
    }

    public void setPreventSinglePointFailure(Boolean preventSinglePointFailure) {
      this.preventSinglePointFailure = preventSinglePointFailure;
    }
    
}
