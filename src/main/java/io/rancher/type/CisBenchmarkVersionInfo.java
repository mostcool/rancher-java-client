package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class CisBenchmarkVersionInfo extends AbstractType {
    
    @JsonProperty("managed")
    private Boolean managed;
    
    @JsonProperty("minKubernetesVersion")
    private String minKubernetesVersion;
    
    @JsonProperty("notApplicableChecks")
    private Map<String, Object> notApplicableChecks;
    
    @JsonProperty("skippedChecks")
    private Map<String, Object> skippedChecks;
    
    public Boolean getManaged() {
        return this.managed;
    }

    public void setManaged(Boolean managed) {
      this.managed = managed;
    }
    
    public String getMinKubernetesVersion() {
        return this.minKubernetesVersion;
    }

    public void setMinKubernetesVersion(String minKubernetesVersion) {
      this.minKubernetesVersion = minKubernetesVersion;
    }
    
    public Map<String, Object> getNotApplicableChecks() {
        return this.notApplicableChecks;
    }

    public void setNotApplicableChecks(Map<String, Object> notApplicableChecks) {
      this.notApplicableChecks = notApplicableChecks;
    }
    
    public Map<String, Object> getSkippedChecks() {
        return this.skippedChecks;
    }

    public void setSkippedChecks(Map<String, Object> skippedChecks) {
      this.skippedChecks = skippedChecks;
    }
    
}
