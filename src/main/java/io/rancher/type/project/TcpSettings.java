package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class TcpSettings extends AbstractType {
    
    @JsonProperty("connectTimeout")
    private String connectTimeout;
    
    @JsonProperty("maxConnections")
    private Integer maxConnections;
    
    public String getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setConnectTimeout(String connectTimeout) {
      this.connectTimeout = connectTimeout;
    }
    
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public void setMaxConnections(Integer maxConnections) {
      this.maxConnections = maxConnections;
    }
    
}
