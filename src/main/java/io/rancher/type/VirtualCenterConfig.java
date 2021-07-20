package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class VirtualCenterConfig extends AbstractType {
    
    @JsonProperty("datacenters")
    private String datacenters;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("port")
    private String port;
    
    @JsonProperty("soap-roundtrip-count")
    private Integer soapRoundtripCount;
    
    @JsonProperty("user")
    private String user;
    
    public String getDatacenters() {
        return this.datacenters;
    }

    public void setDatacenters(String datacenters) {
      this.datacenters = datacenters;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public Integer getSoapRoundtripCount() {
        return this.soapRoundtripCount;
    }

    public void setSoapRoundtripCount(Integer soapRoundtripCount) {
      this.soapRoundtripCount = soapRoundtripCount;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
