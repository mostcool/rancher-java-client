package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Linodeconfig extends AbstractType {
    
    @JsonProperty("authorizedUsers")
    private String authorizedUsers;
    
    @JsonProperty("createPrivateIp")
    private Boolean createPrivateIp;
    
    @JsonProperty("dockerPort")
    private String dockerPort;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("instanceType")
    private String instanceType;
    
    @JsonProperty("label")
    private String label;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("rootPass")
    private String rootPass;
    
    @JsonProperty("sshPort")
    private String sshPort;
    
    @JsonProperty("sshUser")
    private String sshUser;
    
    @JsonProperty("stackscript")
    private String stackscript;
    
    @JsonProperty("stackscriptData")
    private String stackscriptData;
    
    @JsonProperty("swapSize")
    private String swapSize;
    
    @JsonProperty("tags")
    private String tags;
    
    @JsonProperty("token")
    private String token;
    
    @JsonProperty("uaPrefix")
    private String uaPrefix;
    
    public String getAuthorizedUsers() {
        return this.authorizedUsers;
    }

    public void setAuthorizedUsers(String authorizedUsers) {
      this.authorizedUsers = authorizedUsers;
    }
    
    public Boolean getCreatePrivateIp() {
        return this.createPrivateIp;
    }

    public void setCreatePrivateIp(Boolean createPrivateIp) {
      this.createPrivateIp = createPrivateIp;
    }
    
    public String getDockerPort() {
        return this.dockerPort;
    }

    public void setDockerPort(String dockerPort) {
      this.dockerPort = dockerPort;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
      this.label = label;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getRootPass() {
        return this.rootPass;
    }

    public void setRootPass(String rootPass) {
      this.rootPass = rootPass;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getStackscript() {
        return this.stackscript;
    }

    public void setStackscript(String stackscript) {
      this.stackscript = stackscript;
    }
    
    public String getStackscriptData() {
        return this.stackscriptData;
    }

    public void setStackscriptData(String stackscriptData) {
      this.stackscriptData = stackscriptData;
    }
    
    public String getSwapSize() {
        return this.swapSize;
    }

    public void setSwapSize(String swapSize) {
      this.swapSize = swapSize;
    }
    
    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
      this.tags = tags;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public String getUaPrefix() {
        return this.uaPrefix;
    }

    public void setUaPrefix(String uaPrefix) {
      this.uaPrefix = uaPrefix;
    }
    
}
