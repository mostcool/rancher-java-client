package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Vmwarevspherecredentialconfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("password")
    private String password;
    
    /**
     * required true
     */
    @JsonProperty("username")
    private String username;
    
    /**
     * required true
     */
    @JsonProperty("vcenter")
    private String vcenter;
    
    /**
     * required true
     */
    @JsonProperty("vcenterPort")
    private String vcenterPort;
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getVcenter() {
        return this.vcenter;
    }

    public void setVcenter(String vcenter) {
      this.vcenter = vcenter;
    }
    
    public String getVcenterPort() {
        return this.vcenterPort;
    }

    public void setVcenterPort(String vcenterPort) {
      this.vcenterPort = vcenterPort;
    }
    
}
