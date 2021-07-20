package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Digitaloceanconfig extends AbstractType {
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    @JsonProperty("backups")
    private Boolean backups;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("ipv6")
    private Boolean ipv6;
    
    @JsonProperty("monitoring")
    private Boolean monitoring;
    
    @JsonProperty("privateNetworking")
    private Boolean privateNetworking;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("size")
    private String size;
    
    @JsonProperty("sshKeyContents")
    private String sshKeyContents;
    
    @JsonProperty("sshKeyFingerprint")
    private String sshKeyFingerprint;
    
    @JsonProperty("sshPort")
    private String sshPort;
    
    @JsonProperty("sshUser")
    private String sshUser;
    
    @JsonProperty("tags")
    private String tags;
    
    @JsonProperty("userdata")
    private String userdata;
    
    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }
    
    public Boolean getBackups() {
        return this.backups;
    }

    public void setBackups(Boolean backups) {
      this.backups = backups;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getIpv6() {
        return this.ipv6;
    }

    public void setIpv6(Boolean ipv6) {
      this.ipv6 = ipv6;
    }
    
    public Boolean getMonitoring() {
        return this.monitoring;
    }

    public void setMonitoring(Boolean monitoring) {
      this.monitoring = monitoring;
    }
    
    public Boolean getPrivateNetworking() {
        return this.privateNetworking;
    }

    public void setPrivateNetworking(Boolean privateNetworking) {
      this.privateNetworking = privateNetworking;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
      this.size = size;
    }
    
    public String getSshKeyContents() {
        return this.sshKeyContents;
    }

    public void setSshKeyContents(String sshKeyContents) {
      this.sshKeyContents = sshKeyContents;
    }
    
    public String getSshKeyFingerprint() {
        return this.sshKeyFingerprint;
    }

    public void setSshKeyFingerprint(String sshKeyFingerprint) {
      this.sshKeyFingerprint = sshKeyFingerprint;
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
    
    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
      this.tags = tags;
    }
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
    }
    
}
