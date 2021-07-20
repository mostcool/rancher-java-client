package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ImportClusterYamlInput extends AbstractType {
    
    @JsonProperty("defaultNamespace")
    private String defaultNamespace;
    
    @JsonProperty("namespace")
    private String namespace;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("yaml")
    private String yaml;
    
    public String getDefaultNamespace() {
        return this.defaultNamespace;
    }

    public void setDefaultNamespace(String defaultNamespace) {
      this.defaultNamespace = defaultNamespace;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getYaml() {
        return this.yaml;
    }

    public void setYaml(String yaml) {
      this.yaml = yaml;
    }
    
}
