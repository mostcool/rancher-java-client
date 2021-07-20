package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class TopologySpreadConstraint extends AbstractType {
    
    @JsonProperty("labelSelector")
    private LabelSelector labelSelector;
    
    @JsonProperty("maxSkew")
    private Integer maxSkew;
    
    @JsonProperty("topologyKey")
    private String topologyKey;
    
    @JsonProperty("whenUnsatisfiable")
    private String whenUnsatisfiable;
    
    public LabelSelector getLabelSelector() {
        return this.labelSelector;
    }

    public void setLabelSelector(LabelSelector labelSelector) {
      this.labelSelector = labelSelector;
    }
    
    public Integer getMaxSkew() {
        return this.maxSkew;
    }

    public void setMaxSkew(Integer maxSkew) {
      this.maxSkew = maxSkew;
    }
    
    public String getTopologyKey() {
        return this.topologyKey;
    }

    public void setTopologyKey(String topologyKey) {
      this.topologyKey = topologyKey;
    }
    
    public String getWhenUnsatisfiable() {
        return this.whenUnsatisfiable;
    }

    public void setWhenUnsatisfiable(String whenUnsatisfiable) {
      this.whenUnsatisfiable = whenUnsatisfiable;
    }
    
}
