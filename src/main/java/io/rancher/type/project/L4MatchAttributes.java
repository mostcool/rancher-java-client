package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class L4MatchAttributes extends AbstractType {
    
    @JsonProperty("destinationSubnets")
    private List<String> destinationSubnets;
    
    @JsonProperty("gateways")
    private List<String> gateways;
    
    @JsonProperty("port")
    private Integer port;
    
    @JsonProperty("sourceLabels")
    private Map<String, Object> sourceLabels;
    
    public List<String> getDestinationSubnets() {
        return this.destinationSubnets;
    }

    public void setDestinationSubnets(List<String> destinationSubnets) {
      this.destinationSubnets = destinationSubnets;
    }
    
    public List<String> getGateways() {
        return this.gateways;
    }

    public void setGateways(List<String> gateways) {
      this.gateways = gateways;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public Map<String, Object> getSourceLabels() {
        return this.sourceLabels;
    }

    public void setSourceLabels(Map<String, Object> sourceLabels) {
      this.sourceLabels = sourceLabels;
    }
    
}
