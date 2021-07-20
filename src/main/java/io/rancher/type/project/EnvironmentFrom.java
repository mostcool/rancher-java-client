package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class EnvironmentFrom extends AbstractType {
    
    @JsonProperty("optional")
    private Boolean optional;
    
    @JsonProperty("prefix")
    private String prefix;
    
    @JsonProperty("source")
    private String source;
    
    @JsonProperty("sourceKey")
    private String sourceKey;
    
    @JsonProperty("sourceName")
    private String sourceName;
    
    @JsonProperty("targetKey")
    private String targetKey;
    
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
      this.optional = optional;
    }
    
    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
      this.prefix = prefix;
    }
    
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
      this.source = source;
    }
    
    public String getSourceKey() {
        return this.sourceKey;
    }

    public void setSourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
    }
    
    public String getSourceName() {
        return this.sourceName;
    }

    public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
    }
    
    public String getTargetKey() {
        return this.targetKey;
    }

    public void setTargetKey(String targetKey) {
      this.targetKey = targetKey;
    }
    
}
