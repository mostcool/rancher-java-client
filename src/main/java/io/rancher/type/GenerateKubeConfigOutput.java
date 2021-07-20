package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateKubeConfigOutput extends AbstractType {
    
    @JsonProperty("config")
    private String config;
    
    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
      this.config = config;
    }
    
}
