package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class S3BackupConfig extends AbstractType {
    
    @JsonProperty("accessKey")
    private String accessKey;
    
    @JsonProperty("bucketName")
    private String bucketName;
    
    @JsonProperty("customCa")
    private String customCa;
    
    @JsonProperty("endpoint")
    private String endpoint;
    
    @JsonProperty("folder")
    private String folder;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("secretKey")
    private String secretKey;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getBucketName() {
        return this.bucketName;
    }

    public void setBucketName(String bucketName) {
      this.bucketName = bucketName;
    }
    
    public String getCustomCa() {
        return this.customCa;
    }

    public void setCustomCa(String customCa) {
      this.customCa = customCa;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
      this.folder = folder;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
    }
    
}
