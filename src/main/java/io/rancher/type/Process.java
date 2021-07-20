package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Process extends AbstractType {
    
    @JsonProperty("args")
    private List<String> args;
    
    @JsonProperty("binds")
    private List<String> binds;
    
    @JsonProperty("command")
    private List<String> command;
    
    @JsonProperty("env")
    private List<String> env;
    
    @JsonProperty("healthCheck")
    private HealthCheck healthCheck;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("imageRegistryAuthConfig")
    private String imageRegistryAuthConfig;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("networkMode")
    private String networkMode;
    
    @JsonProperty("pidMode")
    private String pidMode;
    
    @JsonProperty("privileged")
    private Boolean privileged;
    
    @JsonProperty("publish")
    private List<String> publish;
    
    @JsonProperty("restartPolicy")
    private String restartPolicy;
    
    @JsonProperty("user")
    private String user;
    
    @JsonProperty("volumesFrom")
    private List<String> volumesFrom;
    
    public List<String> getArgs() {
        return this.args;
    }

    public void setArgs(List<String> args) {
      this.args = args;
    }
    
    public List<String> getBinds() {
        return this.binds;
    }

    public void setBinds(List<String> binds) {
      this.binds = binds;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public List<String> getEnv() {
        return this.env;
    }

    public void setEnv(List<String> env) {
      this.env = env;
    }
    
    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(HealthCheck healthCheck) {
      this.healthCheck = healthCheck;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getImageRegistryAuthConfig() {
        return this.imageRegistryAuthConfig;
    }

    public void setImageRegistryAuthConfig(String imageRegistryAuthConfig) {
      this.imageRegistryAuthConfig = imageRegistryAuthConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNetworkMode() {
        return this.networkMode;
    }

    public void setNetworkMode(String networkMode) {
      this.networkMode = networkMode;
    }
    
    public String getPidMode() {
        return this.pidMode;
    }

    public void setPidMode(String pidMode) {
      this.pidMode = pidMode;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public List<String> getPublish() {
        return this.publish;
    }

    public void setPublish(List<String> publish) {
      this.publish = publish;
    }
    
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
      this.restartPolicy = restartPolicy;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
    public List<String> getVolumesFrom() {
        return this.volumesFrom;
    }

    public void setVolumesFrom(List<String> volumesFrom) {
      this.volumesFrom = volumesFrom;
    }
    
}
