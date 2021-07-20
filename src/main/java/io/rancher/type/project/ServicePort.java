package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ServicePort extends AbstractType {
    
    @JsonProperty("appProtocol")
    private String appProtocol;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nodePort")
    private Integer nodePort;
    
    @JsonProperty("port")
    private Integer port;
    
    @JsonProperty("protocol")
    private String protocol;
    
    @JsonProperty("targetPort")
    private Integer targetPort;
    
    public String getAppProtocol() {
        return this.appProtocol;
    }

    public void setAppProtocol(String appProtocol) {
      this.appProtocol = appProtocol;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getNodePort() {
        return this.nodePort;
    }

    public void setNodePort(Integer nodePort) {
      this.nodePort = nodePort;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
}
