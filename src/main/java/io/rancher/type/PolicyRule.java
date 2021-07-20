package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PolicyRule extends AbstractType {
    
    @JsonProperty("apiGroups")
    private List<String> apiGroups;
    
    @JsonProperty("nonResourceURLs")
    private List<String> nonResourceUrls;
    
    @JsonProperty("resourceNames")
    private List<String> resourceNames;
    
    @JsonProperty("resources")
    private List<String> resources;
    
    @JsonProperty("verbs")
    private List<String> verbs;
    
    public List<String> getApiGroups() {
        return this.apiGroups;
    }

    public void setApiGroups(List<String> apiGroups) {
      this.apiGroups = apiGroups;
    }
    
    public List<String> getNonResourceUrls() {
        return this.nonResourceUrls;
    }

    public void setNonResourceUrls(List<String> nonResourceUrls) {
      this.nonResourceUrls = nonResourceUrls;
    }
    
    public List<String> getResourceNames() {
        return this.resourceNames;
    }

    public void setResourceNames(List<String> resourceNames) {
      this.resourceNames = resourceNames;
    }
    
    public List<String> getResources() {
        return this.resources;
    }

    public void setResources(List<String> resources) {
      this.resources = resources;
    }
    
    public List<String> getVerbs() {
        return this.verbs;
    }

    public void setVerbs(List<String> verbs) {
      this.verbs = verbs;
    }
    
}
