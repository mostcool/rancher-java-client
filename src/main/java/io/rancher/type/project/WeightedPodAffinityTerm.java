package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class WeightedPodAffinityTerm extends AbstractType {
    
    @JsonProperty("podAffinityTerm")
    private PodAffinityTerm podAffinityTerm;
    
    @JsonProperty("weight")
    private Integer weight;
    
    public PodAffinityTerm getPodAffinityTerm() {
        return this.podAffinityTerm;
    }

    public void setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
      this.podAffinityTerm = podAffinityTerm;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
}
