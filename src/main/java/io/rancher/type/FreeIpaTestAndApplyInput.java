package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FreeIpaTestAndApplyInput extends AbstractType {
    
    @JsonProperty("ldapConfig")
    private LdapConfig ldapConfig;
    
    /**
     * required true
     */
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("username")
    private String username;
    
    public LdapConfig getLdapConfig() {
        return this.ldapConfig;
    }

    public void setLdapConfig(LdapConfig ldapConfig) {
      this.ldapConfig = ldapConfig;
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
