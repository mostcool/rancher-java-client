package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ActiveDirectoryTestAndApplyInput extends AbstractType {
    
    @JsonProperty("activeDirectoryConfig")
    private ActiveDirectoryConfig activeDirectoryConfig;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("username")
    private String username;
    
    public ActiveDirectoryConfig getActiveDirectoryConfig() {
        return this.activeDirectoryConfig;
    }

    public void setActiveDirectoryConfig(ActiveDirectoryConfig activeDirectoryConfig) {
      this.activeDirectoryConfig = activeDirectoryConfig;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
