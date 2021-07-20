package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PrivateRegistry extends AbstractType {
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    @JsonProperty("password")
    private String password;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("user")
    private String user;
    
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
      this.isDefault = isDefault;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
