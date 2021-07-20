package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class QuobyteVolumeSource extends AbstractType {
    
    @JsonProperty("group")
    private String group;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("registry")
    private String registry;
    
    @JsonProperty("tenant")
    private String tenant;
    
    @JsonProperty("user")
    private String user;
    
    @JsonProperty("volume")
    private String volume;
    
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
      this.group = group;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getRegistry() {
        return this.registry;
    }

    public void setRegistry(String registry) {
      this.registry = registry;
    }
    
    public String getTenant() {
        return this.tenant;
    }

    public void setTenant(String tenant) {
      this.tenant = tenant;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
    public String getVolume() {
        return this.volume;
    }

    public void setVolume(String volume) {
      this.volume = volume;
    }
    
}
