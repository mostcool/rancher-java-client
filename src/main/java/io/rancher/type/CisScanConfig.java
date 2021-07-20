package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CisScanConfig extends AbstractType {
    
    @JsonProperty("debugMaster")
    private Boolean debugMaster;
    
    @JsonProperty("debugWorker")
    private Boolean debugWorker;
    
    @JsonProperty("overrideBenchmarkVersion")
    private String overrideBenchmarkVersion;
    
    @JsonProperty("overrideSkip")
    private List<String> overrideSkip;
    
    /**
     * required true
     */
    @JsonProperty("profile")
    private String profile;
    
    public Boolean getDebugMaster() {
        return this.debugMaster;
    }

    public void setDebugMaster(Boolean debugMaster) {
      this.debugMaster = debugMaster;
    }
    
    public Boolean getDebugWorker() {
        return this.debugWorker;
    }

    public void setDebugWorker(Boolean debugWorker) {
      this.debugWorker = debugWorker;
    }
    
    public String getOverrideBenchmarkVersion() {
        return this.overrideBenchmarkVersion;
    }

    public void setOverrideBenchmarkVersion(String overrideBenchmarkVersion) {
      this.overrideBenchmarkVersion = overrideBenchmarkVersion;
    }
    
    public List<String> getOverrideSkip() {
        return this.overrideSkip;
    }

    public void setOverrideSkip(List<String> overrideSkip) {
      this.overrideSkip = overrideSkip;
    }
    
    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
      this.profile = profile;
    }
    
}
