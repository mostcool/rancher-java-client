package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RepoPerm extends AbstractType {
    
    @JsonProperty("admin")
    private Boolean admin;
    
    @JsonProperty("pull")
    private Boolean pull;
    
    @JsonProperty("push")
    private Boolean push;
    
    public Boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin(Boolean admin) {
      this.admin = admin;
    }
    
    public Boolean getPull() {
        return this.pull;
    }

    public void setPull(Boolean pull) {
      this.pull = pull;
    }
    
    public Boolean getPush() {
        return this.push;
    }

    public void setPush(Boolean push) {
      this.push = push;
    }
    
}
