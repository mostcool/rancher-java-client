package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Affinity extends AbstractType {
    
    @JsonProperty("nodeAffinity")
    private NodeAffinity nodeAffinity;
    
    @JsonProperty("podAffinity")
    private PodAffinity podAffinity;
    
    @JsonProperty("podAntiAffinity")
    private PodAntiAffinity podAntiAffinity;
    
    public NodeAffinity getNodeAffinity() {
        return this.nodeAffinity;
    }

    public void setNodeAffinity(NodeAffinity nodeAffinity) {
      this.nodeAffinity = nodeAffinity;
    }
    
    public PodAffinity getPodAffinity() {
        return this.podAffinity;
    }

    public void setPodAffinity(PodAffinity podAffinity) {
      this.podAffinity = podAffinity;
    }
    
    public PodAntiAffinity getPodAntiAffinity() {
        return this.podAntiAffinity;
    }

    public void setPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
      this.podAntiAffinity = podAntiAffinity;
    }
    
}
