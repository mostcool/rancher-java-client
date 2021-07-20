package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Destination extends AbstractType {
    
    @JsonProperty("host")
    private String host;
    
    @JsonProperty("port")
    private PortSelector port;
    
    @JsonProperty("subset")
    private String subset;
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
    public PortSelector getPort() {
        return this.port;
    }

    public void setPort(PortSelector port) {
      this.port = port;
    }
    
    public String getSubset() {
        return this.subset;
    }

    public void setSubset(String subset) {
      this.subset = subset;
    }
    
}
