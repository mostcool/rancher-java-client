package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SeLinuxOptions extends AbstractType {
    
    @JsonProperty("level")
    private String level;
    
    @JsonProperty("role")
    private String role;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("user")
    private String user;
    
    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
      this.level = level;
    }
    
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
      this.role = role;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
