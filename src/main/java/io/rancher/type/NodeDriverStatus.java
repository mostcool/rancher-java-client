package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeDriverStatus extends AbstractType {
    
    @JsonProperty("appliedChecksum")
    private String appliedChecksum;
    
    @JsonProperty("appliedDockerMachineVersion")
    private String appliedDockerMachineVersion;
    
    @JsonProperty("appliedURL")
    private String appliedUrl;
    
    @JsonProperty("conditions")
    private List<Condition> conditions;
    
    public String getAppliedChecksum() {
        return this.appliedChecksum;
    }

    public void setAppliedChecksum(String appliedChecksum) {
      this.appliedChecksum = appliedChecksum;
    }
    
    public String getAppliedDockerMachineVersion() {
        return this.appliedDockerMachineVersion;
    }

    public void setAppliedDockerMachineVersion(String appliedDockerMachineVersion) {
      this.appliedDockerMachineVersion = appliedDockerMachineVersion;
    }
    
    public String getAppliedUrl() {
        return this.appliedUrl;
    }

    public void setAppliedUrl(String appliedUrl) {
      this.appliedUrl = appliedUrl;
    }
    
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<Condition> conditions) {
      this.conditions = conditions;
    }
    
}
