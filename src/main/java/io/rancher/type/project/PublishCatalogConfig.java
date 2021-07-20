package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PublishCatalogConfig extends AbstractType {
    
    @JsonProperty("catalogTemplate")
    private String catalogTemplate;
    
    @JsonProperty("gitAuthor")
    private String gitAuthor;
    
    @JsonProperty("gitBranch")
    private String gitBranch;
    
    @JsonProperty("gitEmail")
    private String gitEmail;
    
    @JsonProperty("gitUrl")
    private String gitUrl;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("version")
    private String version;
    
    public String getCatalogTemplate() {
        return this.catalogTemplate;
    }

    public void setCatalogTemplate(String catalogTemplate) {
      this.catalogTemplate = catalogTemplate;
    }
    
    public String getGitAuthor() {
        return this.gitAuthor;
    }

    public void setGitAuthor(String gitAuthor) {
      this.gitAuthor = gitAuthor;
    }
    
    public String getGitBranch() {
        return this.gitBranch;
    }

    public void setGitBranch(String gitBranch) {
      this.gitBranch = gitBranch;
    }
    
    public String getGitEmail() {
        return this.gitEmail;
    }

    public void setGitEmail(String gitEmail) {
      this.gitEmail = gitEmail;
    }
    
    public String getGitUrl() {
        return this.gitUrl;
    }

    public void setGitUrl(String gitUrl) {
      this.gitUrl = gitUrl;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
}
