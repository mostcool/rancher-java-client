package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class AppRevisionStatus extends AbstractType {
    
    @JsonProperty("answers")
    private Map<String, Object> answers;
    
    @JsonProperty("digest")
    private String digest;
    
    @JsonProperty("externalId")
    private String externalId;
    
    @JsonProperty("files")
    private Map<String, Object> files;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("valuesYaml")
    private String valuesYaml;
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public String getDigest() {
        return this.digest;
    }

    public void setDigest(String digest) {
      this.digest = digest;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public Map<String, Object> getFiles() {
        return this.files;
    }

    public void setFiles(Map<String, Object> files) {
      this.files = files;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getValuesYaml() {
        return this.valuesYaml;
    }

    public void setValuesYaml(String valuesYaml) {
      this.valuesYaml = valuesYaml;
    }
    
}
