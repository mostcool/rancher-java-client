package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class AppUpgradeConfig extends AbstractType {
    
    @JsonProperty("answers")
    private Map<String, Object> answers;
    
    @JsonProperty("externalId")
    private String externalId;
    
    @JsonProperty("files")
    private Map<String, Object> files;
    
    @JsonProperty("forceUpgrade")
    private Boolean forceUpgrade;
    
    @JsonProperty("valuesYaml")
    private String valuesYaml;
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
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
    
    public Boolean getForceUpgrade() {
        return this.forceUpgrade;
    }

    public void setForceUpgrade(Boolean forceUpgrade) {
      this.forceUpgrade = forceUpgrade;
    }
    
    public String getValuesYaml() {
        return this.valuesYaml;
    }

    public void setValuesYaml(String valuesYaml) {
      this.valuesYaml = valuesYaml;
    }
    
}
