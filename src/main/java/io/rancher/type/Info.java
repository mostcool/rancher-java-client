package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Info extends AbstractType {
    
    @JsonProperty("buildDate")
    private String buildDate;
    
    @JsonProperty("compiler")
    private String compiler;
    
    @JsonProperty("gitCommit")
    private String gitCommit;
    
    @JsonProperty("gitTreeState")
    private String gitTreeState;
    
    @JsonProperty("gitVersion")
    private String gitVersion;
    
    @JsonProperty("goVersion")
    private String goVersion;
    
    @JsonProperty("major")
    private String major;
    
    @JsonProperty("minor")
    private String minor;
    
    @JsonProperty("platform")
    private String platform;
    
    public String getBuildDate() {
        return this.buildDate;
    }

    public void setBuildDate(String buildDate) {
      this.buildDate = buildDate;
    }
    
    public String getCompiler() {
        return this.compiler;
    }

    public void setCompiler(String compiler) {
      this.compiler = compiler;
    }
    
    public String getGitCommit() {
        return this.gitCommit;
    }

    public void setGitCommit(String gitCommit) {
      this.gitCommit = gitCommit;
    }
    
    public String getGitTreeState() {
        return this.gitTreeState;
    }

    public void setGitTreeState(String gitTreeState) {
      this.gitTreeState = gitTreeState;
    }
    
    public String getGitVersion() {
        return this.gitVersion;
    }

    public void setGitVersion(String gitVersion) {
      this.gitVersion = gitVersion;
    }
    
    public String getGoVersion() {
        return this.goVersion;
    }

    public void setGoVersion(String goVersion) {
      this.goVersion = goVersion;
    }
    
    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
      this.major = major;
    }
    
    public String getMinor() {
        return this.minor;
    }

    public void setMinor(String minor) {
      this.minor = minor;
    }
    
    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
      this.platform = platform;
    }
    
}
