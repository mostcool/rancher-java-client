package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class IngressConfig extends AbstractType {
    
    @JsonProperty("dnsPolicy")
    private String dnsPolicy;
    
    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;
    
    @JsonProperty("extraEnvs")
    private List<Map<String, Object>> extraEnvs;
    
    @JsonProperty("extraVolumeMounts")
    private List<Map<String, Object>> extraVolumeMounts;
    
    @JsonProperty("extraVolumes")
    private List<Map<String, Object>> extraVolumes;
    
    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;
    
    @JsonProperty("options")
    private Map<String, Object> options;
    
    @JsonProperty("provider")
    private String provider;
    
    @JsonProperty("updateStrategy")
    private DaemonSetUpdateStrategy updateStrategy;
    
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
      this.dnsPolicy = dnsPolicy;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<Map<String, Object>> getExtraEnvs() {
        return this.extraEnvs;
    }

    public void setExtraEnvs(List<Map<String, Object>> extraEnvs) {
      this.extraEnvs = extraEnvs;
    }
    
    public List<Map<String, Object>> getExtraVolumeMounts() {
        return this.extraVolumeMounts;
    }

    public void setExtraVolumeMounts(List<Map<String, Object>> extraVolumeMounts) {
      this.extraVolumeMounts = extraVolumeMounts;
    }
    
    public List<Map<String, Object>> getExtraVolumes() {
        return this.extraVolumes;
    }

    public void setExtraVolumes(List<Map<String, Object>> extraVolumes) {
      this.extraVolumes = extraVolumes;
    }
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
    public DaemonSetUpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    public void setUpdateStrategy(DaemonSetUpdateStrategy updateStrategy) {
      this.updateStrategy = updateStrategy;
    }
    
}
