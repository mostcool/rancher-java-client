package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class FeatureStatus extends AbstractType {
    
    @JsonProperty("default")
    private Boolean defaultFlag;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("dynamic")
    private Boolean dynamic;
    
    public Boolean getDefaultFlag() {
        return this.defaultFlag;
    }

    public void setDefaultFlag(Boolean defaultFlag) {
      this.defaultFlag = defaultFlag;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getDynamic() {
        return this.dynamic;
    }

    public void setDynamic(Boolean dynamic) {
      this.dynamic = dynamic;
    }
    
}
