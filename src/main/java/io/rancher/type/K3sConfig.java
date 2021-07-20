package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class K3sConfig extends AbstractType {
    
    @JsonProperty("k3supgradeStrategy")
    private K3sUpgradeStrategy k3supgradeStrategy;
    
    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;
    
    public K3sUpgradeStrategy getK3supgradeStrategy() {
        return this.k3supgradeStrategy;
    }

    public void setK3supgradeStrategy(K3sUpgradeStrategy k3supgradeStrategy) {
      this.k3supgradeStrategy = k3supgradeStrategy;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
}
