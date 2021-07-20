package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class RkeConfigNode extends AbstractType {
    
    @JsonProperty("address")
    private String address;
    
    @JsonProperty("dockerSocket")
    private String dockerSocket;
    
    @JsonProperty("hostnameOverride")
    private String hostnameOverride;
    
    @JsonProperty("internalAddress")
    private String internalAddress;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("nodeId")
    private String nodeId;
    
    @JsonProperty("port")
    private String port;
    
    @JsonProperty("role")
    private List<String> role;
    
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
    
    @JsonProperty("taints")
    private List<RkeTaint> taints;
    
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
    
    public String getHostnameOverride() {
        return this.hostnameOverride;
    }

    public void setHostnameOverride(String hostnameOverride) {
      this.hostnameOverride = hostnameOverride;
    }
    
    public String getInternalAddress() {
        return this.internalAddress;
    }

    public void setInternalAddress(String internalAddress) {
      this.internalAddress = internalAddress;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public List<String> getRole() {
        return this.role;
    }

    public void setRole(List<String> role) {
      this.role = role;
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
    
    public List<RkeTaint> getTaints() {
        return this.taints;
    }

    public void setTaints(List<RkeTaint> taints) {
      this.taints = taints;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
