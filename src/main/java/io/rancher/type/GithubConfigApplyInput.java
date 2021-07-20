package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class GithubConfigApplyInput extends AbstractType {
    
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("githubConfig")
    private GithubConfig githubConfig;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public GithubConfig getGithubConfig() {
        return this.githubConfig;
    }

    public void setGithubConfig(GithubConfig githubConfig) {
      this.githubConfig = githubConfig;
    }
    
}
