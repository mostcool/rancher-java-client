package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class CustomConfig extends AbstractType {
    
    @JsonProperty("address")
    private String address;
    
    @JsonProperty("dockerSocket")
    private String dockerSocket;
    
    @JsonProperty("internalAddress")
    private String internalAddress;
    
    @JsonProperty("label")
    private Map<String, Object> label;
    
    @JsonProperty("sshCert")
    private String sshCert;
    
    @JsonProperty("sshKey")
    private String sshKey;
    
    @JsonProperty("taints")
    private List<String> taints;
    
    @JsonProperty("user")
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getDockerSocket() {
        return this.dockerSocket;
    }

    public void setDockerSocket(String dockerSocket) {
      this.dockerSocket = dockerSocket;
    }
    
    public String getInternalAddress() {
        return this.internalAddress;
    }

    public void setInternalAddress(String internalAddress) {
      this.internalAddress = internalAddress;
    }
    
    public Map<String, Object> getLabel() {
        return this.label;
    }

    public void setLabel(Map<String, Object> label) {
      this.label = label;
    }
    
    public String getSshCert() {
        return this.sshCert;
    }

    public void setSshCert(String sshCert) {
      this.sshCert = sshCert;
    }
    
    public String getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(String sshKey) {
      this.sshKey = sshKey;
    }
    
    public List<String> getTaints() {
        return this.taints;
    }

    public void setTaints(List<String> taints) {
      this.taints = taints;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
