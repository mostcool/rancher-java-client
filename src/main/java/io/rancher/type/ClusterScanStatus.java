package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ClusterScanStatus extends AbstractType {
    
    @JsonProperty("cisScanStatus")
    private CisScanStatus cisScanStatus;
    
    @JsonProperty("conditions")
    private List<ClusterScanCondition> conditions;
    
    public CisScanStatus getCisScanStatus() {
        return this.cisScanStatus;
    }

    public void setCisScanStatus(CisScanStatus cisScanStatus) {
      this.cisScanStatus = cisScanStatus;
    }
    
    public List<ClusterScanCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ClusterScanCondition> conditions) {
      this.conditions = conditions;
    }
    
}
