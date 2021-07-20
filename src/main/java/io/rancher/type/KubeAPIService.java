package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class KubeAPIService extends AbstractType {
    
    @JsonProperty("admissionConfiguration")
    private Map<String, Object> admissionConfiguration;
    
    @JsonProperty("alwaysPullImages")
    private Boolean alwaysPullImages;
    
    @JsonProperty("auditLog")
    private AuditLog auditLog;
    
    @JsonProperty("eventRateLimit")
    private EventRateLimit eventRateLimit;
    
    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;
    
    @JsonProperty("extraBinds")
    private List<String> extraBinds;
    
    @JsonProperty("extraEnv")
    private List<String> extraEnv;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("podSecurityPolicy")
    private Boolean podSecurityPolicy;
    
    @JsonProperty("secretsEncryptionConfig")
    private SecretsEncryptionConfig secretsEncryptionConfig;
    
    @JsonProperty("serviceClusterIpRange")
    private String serviceClusterIpRange;
    
    @JsonProperty("serviceNodePortRange")
    private String serviceNodePortRange;
    
    @JsonProperty("winExtraArgs")
    private Map<String, Object> winExtraArgs;
    
    @JsonProperty("winExtraBinds")
    private List<String> winExtraBinds;
    
    @JsonProperty("winExtraEnv")
    private List<String> winExtraEnv;
    
    public Map<String, Object> getAdmissionConfiguration() {
        return this.admissionConfiguration;
    }

    public void setAdmissionConfiguration(Map<String, Object> admissionConfiguration) {
      this.admissionConfiguration = admissionConfiguration;
    }
    
    public Boolean getAlwaysPullImages() {
        return this.alwaysPullImages;
    }

    public void setAlwaysPullImages(Boolean alwaysPullImages) {
      this.alwaysPullImages = alwaysPullImages;
    }
    
    public AuditLog getAuditLog() {
        return this.auditLog;
    }

    public void setAuditLog(AuditLog auditLog) {
      this.auditLog = auditLog;
    }
    
    public EventRateLimit getEventRateLimit() {
        return this.eventRateLimit;
    }

    public void setEventRateLimit(EventRateLimit eventRateLimit) {
      this.eventRateLimit = eventRateLimit;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<String> getExtraBinds() {
        return this.extraBinds;
    }

    public void setExtraBinds(List<String> extraBinds) {
      this.extraBinds = extraBinds;
    }
    
    public List<String> getExtraEnv() {
        return this.extraEnv;
    }

    public void setExtraEnv(List<String> extraEnv) {
      this.extraEnv = extraEnv;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getPodSecurityPolicy() {
        return this.podSecurityPolicy;
    }

    public void setPodSecurityPolicy(Boolean podSecurityPolicy) {
      this.podSecurityPolicy = podSecurityPolicy;
    }
    
    public SecretsEncryptionConfig getSecretsEncryptionConfig() {
        return this.secretsEncryptionConfig;
    }

    public void setSecretsEncryptionConfig(SecretsEncryptionConfig secretsEncryptionConfig) {
      this.secretsEncryptionConfig = secretsEncryptionConfig;
    }
    
    public String getServiceClusterIpRange() {
        return this.serviceClusterIpRange;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
      this.serviceClusterIpRange = serviceClusterIpRange;
    }
    
    public String getServiceNodePortRange() {
        return this.serviceNodePortRange;
    }

    public void setServiceNodePortRange(String serviceNodePortRange) {
      this.serviceNodePortRange = serviceNodePortRange;
    }
    
    public Map<String, Object> getWinExtraArgs() {
        return this.winExtraArgs;
    }

    public void setWinExtraArgs(Map<String, Object> winExtraArgs) {
      this.winExtraArgs = winExtraArgs;
    }
    
    public List<String> getWinExtraBinds() {
        return this.winExtraBinds;
    }

    public void setWinExtraBinds(List<String> winExtraBinds) {
      this.winExtraBinds = winExtraBinds;
    }
    
    public List<String> getWinExtraEnv() {
        return this.winExtraEnv;
    }

    public void setWinExtraEnv(List<String> winExtraEnv) {
      this.winExtraEnv = winExtraEnv;
    }
    
}
