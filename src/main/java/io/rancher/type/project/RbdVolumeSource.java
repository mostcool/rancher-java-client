package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class RbdVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("keyring")
    private String keyring;
    
    @JsonProperty("monitors")
    private List<String> monitors;
    
    @JsonProperty("pool")
    private String pool;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;
    
    @JsonProperty("user")
    private String user;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getKeyring() {
        return this.keyring;
    }

    public void setKeyring(String keyring) {
      this.keyring = keyring;
    }
    
    public List<String> getMonitors() {
        return this.monitors;
    }

    public void setMonitors(List<String> monitors) {
      this.monitors = monitors;
    }
    
    public String getPool() {
        return this.pool;
    }

    public void setPool(String pool) {
      this.pool = pool;
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
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
