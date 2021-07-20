package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class EnvFromSource extends AbstractType {
    
    @JsonProperty("configMapRef")
    private ConfigMapEnvSource configMapRef;
    
    @JsonProperty("prefix")
    private String prefix;
    
    @JsonProperty("secretRef")
    private SecretEnvSource secretRef;
    
    public ConfigMapEnvSource getConfigMapRef() {
        return this.configMapRef;
    }

    public void setConfigMapRef(ConfigMapEnvSource configMapRef) {
      this.configMapRef = configMapRef;
    }
    
    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
      this.prefix = prefix;
    }
    
    public SecretEnvSource getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(SecretEnvSource secretRef) {
      this.secretRef = secretRef;
    }
    
}
