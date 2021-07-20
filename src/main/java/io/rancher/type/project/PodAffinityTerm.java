package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PodAffinityTerm extends AbstractType {
    
    @JsonProperty("labelSelector")
    private LabelSelector labelSelector;
    
    @JsonProperty("namespaces")
    private List<String> namespaces;
    
    @JsonProperty("topologyKey")
    private String topologyKey;
    
    public LabelSelector getLabelSelector() {
        return this.labelSelector;
    }

    public void setLabelSelector(LabelSelector labelSelector) {
      this.labelSelector = labelSelector;
    }
    
    public List<String> getNamespaces() {
        return this.namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
      this.namespaces = namespaces;
    }
    
    public String getTopologyKey() {
        return this.topologyKey;
    }

    public void setTopologyKey(String topologyKey) {
      this.topologyKey = topologyKey;
    }
    
}
