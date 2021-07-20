package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class PushPipelineConfigInput extends AbstractType {
    
    @JsonProperty("configs")
    private Map<String, Object> configs;
    
    public Map<String, Object> getConfigs() {
        return this.configs;
    }

    public void setConfigs(Map<String, Object> configs) {
      this.configs = configs;
    }
    
}
