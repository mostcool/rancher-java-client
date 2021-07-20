package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CisConfigParams extends AbstractType {
    
    @JsonProperty("benchmarkVersion")
    private String benchmarkVersion;
    
    public String getBenchmarkVersion() {
        return this.benchmarkVersion;
    }

    public void setBenchmarkVersion(String benchmarkVersion) {
      this.benchmarkVersion = benchmarkVersion;
    }
    
}
