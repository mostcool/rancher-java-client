package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ResourceFieldSelector extends AbstractType {
    
    @JsonProperty("containerName")
    private String containerName;
    
    @JsonProperty("divisor")
    private String divisor;
    
    @JsonProperty("resource")
    private String resource;
    
    public String getContainerName() {
        return this.containerName;
    }

    public void setContainerName(String containerName) {
      this.containerName = containerName;
    }
    
    public String getDivisor() {
        return this.divisor;
    }

    public void setDivisor(String divisor) {
      this.divisor = divisor;
    }
    
    public String getResource() {
        return this.resource;
    }

    public void setResource(String resource) {
      this.resource = resource;
    }
    
}
