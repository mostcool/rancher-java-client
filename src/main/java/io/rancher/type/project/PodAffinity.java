package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class PodAffinity extends AbstractType {
    
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;
    
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;
    
    public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
      this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }
    
    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
      this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }
    
}
