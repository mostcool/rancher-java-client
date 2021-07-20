package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class PersistentVolumeClaimStatus extends AbstractType {
    
    @JsonProperty("accessModes")
    private List<String> accessModes;
    
    @JsonProperty("capacity")
    private Map<String, Object> capacity;
    
    @JsonProperty("conditions")
    private List<PersistentVolumeClaimCondition> conditions;
    
    @JsonProperty("phase")
    private String phase;
    
    public List<String> getAccessModes() {
        return this.accessModes;
    }

    public void setAccessModes(List<String> accessModes) {
      this.accessModes = accessModes;
    }
    
    public Map<String, Object> getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
      this.capacity = capacity;
    }
    
    public List<PersistentVolumeClaimCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<PersistentVolumeClaimCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
      this.phase = phase;
    }
    
}
