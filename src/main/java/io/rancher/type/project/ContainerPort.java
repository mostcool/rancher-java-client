package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ContainerPort extends AbstractType {
    
    @JsonProperty("containerPort")
    private Integer containerPort;
    
    @JsonProperty("dnsName")
    private String dnsName;
    
    @JsonProperty("hostIp")
    private String hostIp;
    
    @JsonProperty("hostPort")
    private Integer hostPort;
    
    @JsonProperty("kind")
    private String kind;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("protocol")
    private String protocol;
    
    @JsonProperty("sourcePort")
    private Integer sourcePort;
    
    public Integer getContainerPort() {
        return this.containerPort;
    }

    public void setContainerPort(Integer containerPort) {
      this.containerPort = containerPort;
    }
    
    public String getDnsName() {
        return this.dnsName;
    }

    public void setDnsName(String dnsName) {
      this.dnsName = dnsName;
    }
    
    public String getHostIp() {
        return this.hostIp;
    }

    public void setHostIp(String hostIp) {
      this.hostIp = hostIp;
    }
    
    public Integer getHostPort() {
        return this.hostPort;
    }

    public void setHostPort(Integer hostPort) {
      this.hostPort = hostPort;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public void setSourcePort(Integer sourcePort) {
      this.sourcePort = sourcePort;
    }
    
}
