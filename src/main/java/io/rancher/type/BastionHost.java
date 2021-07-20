package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class BastionHost extends AbstractType {
    
    @JsonProperty("address")
    private String address;
    
    @JsonProperty("port")
    private String port;
    
    @JsonProperty("sshAgentAuth")
    private Boolean sshAgentAuth;
    
    @JsonProperty("sshCert")
    private String sshCert;
    
    @JsonProperty("sshCertPath")
    private String sshCertPath;
    
    @JsonProperty("sshKey")
    private String sshKey;
    
    @JsonProperty("sshKeyPath")
    private String sshKeyPath;
    
    @JsonProperty("user")
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public Boolean getSshAgentAuth() {
        return this.sshAgentAuth;
    }

    public void setSshAgentAuth(Boolean sshAgentAuth) {
      this.sshAgentAuth = sshAgentAuth;
    }
    
    public String getSshCert() {
        return this.sshCert;
    }

    public void setSshCert(String sshCert) {
      this.sshCert = sshCert;
    }
    
    public String getSshCertPath() {
        return this.sshCertPath;
    }

    public void setSshCertPath(String sshCertPath) {
      this.sshCertPath = sshCertPath;
    }
    
    public String getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(String sshKey) {
      this.sshKey = sshKey;
    }
    
    public String getSshKeyPath() {
        return this.sshKeyPath;
    }

    public void setSshKeyPath(String sshKeyPath) {
      this.sshKeyPath = sshKeyPath;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
