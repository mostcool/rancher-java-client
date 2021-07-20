package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Step extends AbstractType {
    
    @JsonProperty("applyAppConfig")
    private ApplyAppConfig applyAppConfig;
    
    @JsonProperty("applyYamlConfig")
    private ApplyYamlConfig applyYamlConfig;
    
    @JsonProperty("cpuLimit")
    private String cpuLimit;
    
    @JsonProperty("cpuRequest")
    private String cpuRequest;
    
    @JsonProperty("env")
    private Map<String, Object> env;
    
    @JsonProperty("envFrom")
    private List<EnvFrom> envFrom;
    
    @JsonProperty("memoryLimit")
    private String memoryLimit;
    
    @JsonProperty("memoryRequest")
    private String memoryRequest;
    
    @JsonProperty("privileged")
    private Boolean privileged;
    
    @JsonProperty("publishCatalogConfig")
    private PublishCatalogConfig publishCatalogConfig;
    
    @JsonProperty("publishImageConfig")
    private PublishImageConfig publishImageConfig;
    
    @JsonProperty("runScriptConfig")
    private RunScriptConfig runScriptConfig;
    
    @JsonProperty("sourceCodeConfig")
    private SourceCodeConfig sourceCodeConfig;
    
    @JsonProperty("when")
    private Constraints when;
    
    public ApplyAppConfig getApplyAppConfig() {
        return this.applyAppConfig;
    }

    public void setApplyAppConfig(ApplyAppConfig applyAppConfig) {
      this.applyAppConfig = applyAppConfig;
    }
    
    public ApplyYamlConfig getApplyYamlConfig() {
        return this.applyYamlConfig;
    }

    public void setApplyYamlConfig(ApplyYamlConfig applyYamlConfig) {
      this.applyYamlConfig = applyYamlConfig;
    }
    
    public String getCpuLimit() {
        return this.cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
      this.cpuLimit = cpuLimit;
    }
    
    public String getCpuRequest() {
        return this.cpuRequest;
    }

    public void setCpuRequest(String cpuRequest) {
      this.cpuRequest = cpuRequest;
    }
    
    public Map<String, Object> getEnv() {
        return this.env;
    }

    public void setEnv(Map<String, Object> env) {
      this.env = env;
    }
    
    public List<EnvFrom> getEnvFrom() {
        return this.envFrom;
    }

    public void setEnvFrom(List<EnvFrom> envFrom) {
      this.envFrom = envFrom;
    }
    
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
      this.memoryLimit = memoryLimit;
    }
    
    public String getMemoryRequest() {
        return this.memoryRequest;
    }

    public void setMemoryRequest(String memoryRequest) {
      this.memoryRequest = memoryRequest;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public PublishCatalogConfig getPublishCatalogConfig() {
        return this.publishCatalogConfig;
    }

    public void setPublishCatalogConfig(PublishCatalogConfig publishCatalogConfig) {
      this.publishCatalogConfig = publishCatalogConfig;
    }
    
    public PublishImageConfig getPublishImageConfig() {
        return this.publishImageConfig;
    }

    public void setPublishImageConfig(PublishImageConfig publishImageConfig) {
      this.publishImageConfig = publishImageConfig;
    }
    
    public RunScriptConfig getRunScriptConfig() {
        return this.runScriptConfig;
    }

    public void setRunScriptConfig(RunScriptConfig runScriptConfig) {
      this.runScriptConfig = runScriptConfig;
    }
    
    public SourceCodeConfig getSourceCodeConfig() {
        return this.sourceCodeConfig;
    }

    public void setSourceCodeConfig(SourceCodeConfig sourceCodeConfig) {
      this.sourceCodeConfig = sourceCodeConfig;
    }
    
    public Constraints getWhen() {
        return this.when;
    }

    public void setWhen(Constraints when) {
      this.when = when;
    }
    
}
