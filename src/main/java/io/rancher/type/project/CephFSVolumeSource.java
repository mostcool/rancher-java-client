package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CephFSVolumeSource extends AbstractType {
    
    @JsonProperty("monitors")
    private List<String> monitors;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("secretFile")
    private String secretFile;
    
    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;
    
    @JsonProperty("user")
    private String user;
    
    public List<String> getMonitors() {
        return this.monitors;
    }

    public void setMonitors(List<String> monitors) {
      this.monitors = monitors;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getSecretFile() {
        return this.secretFile;
    }

    public void setSecretFile(String secretFile) {
      this.secretFile = secretFile;
    }
    
    public LocalObjectReference getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(LocalObjectReference secretRef) {
      this.secretRef = secretRef;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
