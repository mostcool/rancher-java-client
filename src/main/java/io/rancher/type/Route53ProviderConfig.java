package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Route53ProviderConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("accessKey")
    private String accessKey;
    
    @JsonProperty("credentialsPath")
    private String credentialsPath;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("roleArn")
    private String roleArn;
    
    /**
     * required true
     */
    @JsonProperty("secretKey")
    private String secretKey;
    
    @JsonProperty("zoneType")
    private String zoneType;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getCredentialsPath() {
        return this.credentialsPath;
    }

    public void setCredentialsPath(String credentialsPath) {
      this.credentialsPath = credentialsPath;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getRoleArn() {
        return this.roleArn;
    }

    public void setRoleArn(String roleArn) {
      this.roleArn = roleArn;
    }
    
    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
    }
    
    public String getZoneType() {
        return this.zoneType;
    }

    public void setZoneType(String zoneType) {
      this.zoneType = zoneType;
    }
    
}
