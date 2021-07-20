package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class KubeControllerService extends AbstractType {
    
    @JsonProperty("clusterCidr")
    private String clusterCidr;
    
    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;
    
    @JsonProperty("extraBinds")
    private List<String> extraBinds;
    
    @JsonProperty("extraEnv")
    private List<String> extraEnv;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("serviceClusterIpRange")
    private String serviceClusterIpRange;
    
    @JsonProperty("winExtraArgs")
    private Map<String, Object> winExtraArgs;
    
    @JsonProperty("winExtraBinds")
    private List<String> winExtraBinds;
    
    @JsonProperty("winExtraEnv")
    private List<String> winExtraEnv;
    
    public String getClusterCidr() {
        return this.clusterCidr;
    }

    public void setClusterCidr(String clusterCidr) {
      this.clusterCidr = clusterCidr;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<String> getExtraBinds() {
        return this.extraBinds;
    }

    public void setExtraBinds(List<String> extraBinds) {
      this.extraBinds = extraBinds;
    }
    
    public List<String> getExtraEnv() {
        return this.extraEnv;
    }

    public void setExtraEnv(List<String> extraEnv) {
      this.extraEnv = extraEnv;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getServiceClusterIpRange() {
        return this.serviceClusterIpRange;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
      this.serviceClusterIpRange = serviceClusterIpRange;
    }
    
    public Map<String, Object> getWinExtraArgs() {
        return this.winExtraArgs;
    }

    public void setWinExtraArgs(Map<String, Object> winExtraArgs) {
      this.winExtraArgs = winExtraArgs;
    }
    
    public List<String> getWinExtraBinds() {
        return this.winExtraBinds;
    }

    public void setWinExtraBinds(List<String> winExtraBinds) {
      this.winExtraBinds = winExtraBinds;
    }
    
    public List<String> getWinExtraEnv() {
        return this.winExtraEnv;
    }

    public void setWinExtraEnv(List<String> winExtraEnv) {
      this.winExtraEnv = winExtraEnv;
    }
    
}
