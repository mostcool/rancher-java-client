package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class KeyToPath extends AbstractType {
    
    @JsonProperty("key")
    private String key;
    
    @JsonProperty("mode")
    private Integer mode;
    
    @JsonProperty("path")
    private String path;
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public Integer getMode() {
        return this.mode;
    }

    public void setMode(Integer mode) {
      this.mode = mode;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
}
