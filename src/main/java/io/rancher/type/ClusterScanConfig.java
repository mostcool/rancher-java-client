package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClusterScanConfig extends AbstractType {
    
    @JsonProperty("cisScanConfig")
    private CisScanConfig cisScanConfig;
    
    public CisScanConfig getCisScanConfig() {
        return this.cisScanConfig;
    }

    public void setCisScanConfig(CisScanConfig cisScanConfig) {
      this.cisScanConfig = cisScanConfig;
    }
    
}
