package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class IngressBackend extends AbstractType {
    
    @JsonProperty("resource")
    private TypedLocalObjectReference resource;
    
    @JsonProperty("serviceId")
    private String serviceId;
    
    @JsonProperty("targetPort")
    private Integer targetPort;
    
    @JsonProperty("workloadIds")
    private List<String> workloadIds;
    
    public TypedLocalObjectReference getResource() {
        return this.resource;
    }

    public void setResource(TypedLocalObjectReference resource) {
      this.resource = resource;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
    public List<String> getWorkloadIds() {
        return this.workloadIds;
    }

    public void setWorkloadIds(List<String> workloadIds) {
      this.workloadIds = workloadIds;
    }
    
}
