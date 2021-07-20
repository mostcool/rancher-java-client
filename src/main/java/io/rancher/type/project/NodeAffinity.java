package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeAffinity extends AbstractType {
    
    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
    
    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;
    
    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
      this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }
    
    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
      this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }
    
}
