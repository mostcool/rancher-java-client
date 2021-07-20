package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RegistryCredential extends AbstractType {
    
    @JsonProperty("auth")
    private String auth;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("username")
    private String username;
    
    public String getAuth() {
        return this.auth;
    }

    public void setAuth(String auth) {
      this.auth = auth;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
      this.email = email;
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
