package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class ApplyAppConfig extends AbstractType {
    
    @JsonProperty("answers")
    private Map<String, Object> answers;
    
    @JsonProperty("catalogTemplate")
    private String catalogTemplate;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("targetNamespace")
    private String targetNamespace;
    
    @JsonProperty("version")
    private String version;
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public String getCatalogTemplate() {
        return this.catalogTemplate;
    }

    public void setCatalogTemplate(String catalogTemplate) {
      this.catalogTemplate = catalogTemplate;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
      this.targetNamespace = targetNamespace;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
}
