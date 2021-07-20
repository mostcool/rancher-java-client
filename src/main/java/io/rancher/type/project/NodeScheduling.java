package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeScheduling extends AbstractType {
    
    @JsonProperty("nodeId")
    private String nodeId;
    
    @JsonProperty("preferred")
    private List<String> preferred;
    
    @JsonProperty("requireAll")
    private List<String> requireAll;
    
    @JsonProperty("requireAny")
    private List<String> requireAny;
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public List<String> getPreferred() {
        return this.preferred;
    }

    public void setPreferred(List<String> preferred) {
      this.preferred = preferred;
    }
    
    public List<String> getRequireAll() {
        return this.requireAll;
    }

    public void setRequireAll(List<String> requireAll) {
      this.requireAll = requireAll;
    }
    
    public List<String> getRequireAny() {
        return this.requireAny;
    }

    public void setRequireAny(List<String> requireAny) {
      this.requireAny = requireAny;
    }
    
}
