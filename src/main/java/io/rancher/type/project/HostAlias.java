package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class HostAlias extends AbstractType {
    
    @JsonProperty("hostnames")
    private List<String> hostnames;
    
    @JsonProperty("ip")
    private String ip;
    
    public List<String> getHostnames() {
        return this.hostnames;
    }

    public void setHostnames(List<String> hostnames) {
      this.hostnames = hostnames;
    }
    
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
      this.ip = ip;
    }
    
}
