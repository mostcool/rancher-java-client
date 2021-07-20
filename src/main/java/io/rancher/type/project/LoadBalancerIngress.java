package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class LoadBalancerIngress extends AbstractType {
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("ip")
    private String ip;
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
      this.ip = ip;
    }
    
}
