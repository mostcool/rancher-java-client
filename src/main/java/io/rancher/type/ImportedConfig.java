package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ImportedConfig extends AbstractType {
    
    @JsonProperty("kubeConfig")
    private String kubeConfig;
    
    public String getKubeConfig() {
        return this.kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
      this.kubeConfig = kubeConfig;
    }
    
}
