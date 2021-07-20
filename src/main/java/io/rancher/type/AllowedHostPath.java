package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AllowedHostPath extends AbstractType {
    
    @JsonProperty("pathPrefix")
    private String pathPrefix;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public void setPathPrefix(String pathPrefix) {
      this.pathPrefix = pathPrefix;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
