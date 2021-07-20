package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class Answer extends AbstractType {
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("projectId")
    private String projectId;
    
    /**
     * required true
     */
    @JsonProperty("values")
    private Map<String, Object> values;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public Map<String, Object> getValues() {
        return this.values;
    }

    public void setValues(Map<String, Object> values) {
      this.values = values;
    }
    
}
