package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class AuditLogConfig extends AbstractType {
    
    @JsonProperty("format")
    private String format;
    
    @JsonProperty("maxAge")
    private Integer maxAge;
    
    @JsonProperty("maxBackup")
    private Integer maxBackup;
    
    @JsonProperty("maxSize")
    private Integer maxSize;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("policy")
    private Map<String, Object> policy;
    
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
      this.format = format;
    }
    
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(Integer maxAge) {
      this.maxAge = maxAge;
    }
    
    public Integer getMaxBackup() {
        return this.maxBackup;
    }

    public void setMaxBackup(Integer maxBackup) {
      this.maxBackup = maxBackup;
    }
    
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(Integer maxSize) {
      this.maxSize = maxSize;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Map<String, Object> getPolicy() {
        return this.policy;
    }

    public void setPolicy(Map<String, Object> policy) {
      this.policy = policy;
    }
    
}
