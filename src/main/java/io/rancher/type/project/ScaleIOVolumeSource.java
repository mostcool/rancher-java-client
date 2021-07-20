package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ScaleIOVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("gateway")
    private String gateway;
    
    @JsonProperty("protectionDomain")
    private String protectionDomain;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;
    
    @JsonProperty("sslEnabled")
    private Boolean sslEnabled;
    
    @JsonProperty("storageMode")
    private String storageMode;
    
    @JsonProperty("storagePool")
    private String storagePool;
    
    @JsonProperty("system")
    private String system;
    
    @JsonProperty("volumeName")
    private String volumeName;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
      this.gateway = gateway;
    }
    
    public String getProtectionDomain() {
        return this.protectionDomain;
    }

    public void setProtectionDomain(String protectionDomain) {
      this.protectionDomain = protectionDomain;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public LocalObjectReference getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(LocalObjectReference secretRef) {
      this.secretRef = secretRef;
    }
    
    public Boolean getSslEnabled() {
        return this.sslEnabled;
    }

    public void setSslEnabled(Boolean sslEnabled) {
      this.sslEnabled = sslEnabled;
    }
    
    public String getStorageMode() {
        return this.storageMode;
    }

    public void setStorageMode(String storageMode) {
      this.storageMode = storageMode;
    }
    
    public String getStoragePool() {
        return this.storagePool;
    }

    public void setStoragePool(String storagePool) {
      this.storagePool = storagePool;
    }
    
    public String getSystem() {
        return this.system;
    }

    public void setSystem(String system) {
      this.system = system;
    }
    
    public String getVolumeName() {
        return this.volumeName;
    }

    public void setVolumeName(String volumeName) {
      this.volumeName = volumeName;
    }
    
}
