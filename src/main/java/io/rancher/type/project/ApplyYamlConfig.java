package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ApplyYamlConfig extends AbstractType {
    
    @JsonProperty("content")
    private String content;
    
    @JsonProperty("namespace")
    private String namespace;
    
    @JsonProperty("path")
    private String path;
    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
      this.content = content;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
}
