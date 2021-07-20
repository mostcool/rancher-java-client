package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClusterScanRule extends AbstractType {
    
    @JsonProperty("failuresOnly")
    private Boolean failuresOnly;
    
    /**
     * required true
     */
    @JsonProperty("scanRunType")
    private String scanRunType;
    
    public Boolean getFailuresOnly() {
        return this.failuresOnly;
    }

    public void setFailuresOnly(Boolean failuresOnly) {
      this.failuresOnly = failuresOnly;
    }
    
    public String getScanRunType() {
        return this.scanRunType;
    }

    public void setScanRunType(String scanRunType) {
      this.scanRunType = scanRunType;
    }
    
}
