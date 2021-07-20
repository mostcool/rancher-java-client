package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SecretOrConfigMap extends AbstractType {
    
    @JsonProperty("configMap")
    private ConfigMapKeySelector configMap;
    
    @JsonProperty("secret")
    private SecretKeySelector secret;
    
    public ConfigMapKeySelector getConfigMap() {
        return this.configMap;
    }

    public void setConfigMap(ConfigMapKeySelector configMap) {
      this.configMap = configMap;
    }
    
    public SecretKeySelector getSecret() {
        return this.secret;
    }

    public void setSecret(SecretKeySelector secret) {
      this.secret = secret;
    }
    
}
