package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Subscribe extends AbstractType {
    
    @JsonProperty("apiVersions")
    private List<String> apiVersions;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("resourceTypes")
    private List<String> resourceTypes;
    
    public List<String> getApiVersions() {
        return this.apiVersions;
    }

    public void setApiVersions(List<String> apiVersions) {
      this.apiVersions = apiVersions;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
      this.resourceTypes = resourceTypes;
    }
    
}
