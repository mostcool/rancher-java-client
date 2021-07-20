package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class KubernetesInfo extends AbstractType {
    
    @JsonProperty("kubeProxyVersion")
    private String kubeProxyVersion;
    
    @JsonProperty("kubeletVersion")
    private String kubeletVersion;
    
    public String getKubeProxyVersion() {
        return this.kubeProxyVersion;
    }

    public void setKubeProxyVersion(String kubeProxyVersion) {
      this.kubeProxyVersion = kubeProxyVersion;
    }
    
    public String getKubeletVersion() {
        return this.kubeletVersion;
    }

    public void setKubeletVersion(String kubeletVersion) {
      this.kubeletVersion = kubeletVersion;
    }
    
}
