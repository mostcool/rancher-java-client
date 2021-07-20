package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class TlsMatchAttributes extends AbstractType {
    
    @JsonProperty("destinationSubnets")
    private List<String> destinationSubnets;
    
    @JsonProperty("gateways")
    private List<String> gateways;
    
    @JsonProperty("port")
    private Integer port;
    
    @JsonProperty("sniHosts")
    private List<String> sniHosts;
    
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
    
    public List<String> getSniHosts() {
        return this.sniHosts;
    }

    public void setSniHosts(List<String> sniHosts) {
      this.sniHosts = sniHosts;
    }
    
    public Map<String, Object> getSourceLabels() {
        return this.sourceLabels;
    }

    public void setSourceLabels(Map<String, Object> sourceLabels) {
      this.sourceLabels = sourceLabels;
    }
    
}
