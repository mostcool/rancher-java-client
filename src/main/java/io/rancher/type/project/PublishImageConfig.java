package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PublishImageConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("buildContext")
    private String buildContext;
    
    /**
     * required true
     */
    @JsonProperty("dockerfilePath")
    private String dockerfilePath;
    
    @JsonProperty("pushRemote")
    private Boolean pushRemote;
    
    @JsonProperty("registry")
    private String registry;
    
    /**
     * required true
     */
    @JsonProperty("tag")
    private String tag;
    
    public String getBuildContext() {
        return this.buildContext;
    }

    public void setBuildContext(String buildContext) {
      this.buildContext = buildContext;
    }
    
    public String getDockerfilePath() {
        return this.dockerfilePath;
    }

    public void setDockerfilePath(String dockerfilePath) {
      this.dockerfilePath = dockerfilePath;
    }
    
    public Boolean getPushRemote() {
        return this.pushRemote;
    }

    public void setPushRemote(Boolean pushRemote) {
      this.pushRemote = pushRemote;
    }
    
    public String getRegistry() {
        return this.registry;
    }

    public void setRegistry(String registry) {
      this.registry = registry;
    }
    
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
      this.tag = tag;
    }
    
}
