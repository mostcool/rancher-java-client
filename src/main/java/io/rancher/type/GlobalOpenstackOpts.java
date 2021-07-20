package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class GlobalOpenstackOpts extends AbstractType {
    
    @JsonProperty("auth-url")
    private String authUrl;
    
    @JsonProperty("ca-file")
    private String caFile;
    
    @JsonProperty("domain-id")
    private String domainId;
    
    @JsonProperty("domain-name")
    private String domainName;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("tenant-id")
    private String tenantId;
    
    @JsonProperty("tenant-name")
    private String tenantName;
    
    @JsonProperty("trust-id")
    private String trustId;
    
    @JsonProperty("user-id")
    private String userId;
    
    @JsonProperty("username")
    private String username;
    
    public String getAuthUrl() {
        return this.authUrl;
    }

    public void setAuthUrl(String authUrl) {
      this.authUrl = authUrl;
    }
    
    public String getCaFile() {
        return this.caFile;
    }

    public void setCaFile(String caFile) {
      this.caFile = caFile;
    }
    
    public String getDomainId() {
        return this.domainId;
    }

    public void setDomainId(String domainId) {
      this.domainId = domainId;
    }
    
    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
      this.domainName = domainName;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
      this.tenantName = tenantName;
    }
    
    public String getTrustId() {
        return this.trustId;
    }

    public void setTrustId(String trustId) {
      this.trustId = trustId;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
