package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class OsInfo extends AbstractType {
    
    @JsonProperty("dockerVersion")
    private String dockerVersion;
    
    @JsonProperty("kernelVersion")
    private String kernelVersion;
    
    @JsonProperty("operatingSystem")
    private String operatingSystem;
    
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
      this.dockerVersion = dockerVersion;
    }
    
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
      this.kernelVersion = kernelVersion;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    
}
