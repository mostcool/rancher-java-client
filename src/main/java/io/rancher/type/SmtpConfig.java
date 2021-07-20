package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SmtpConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("defaultRecipient")
    private String defaultRecipient;
    
    /**
     * required true
     */
    @JsonProperty("host")
    private String host;
    
    @JsonProperty("password")
    private String password;
    
    /**
     * required true
     */
    @JsonProperty("port")
    private Integer port;
    
    /**
     * required true
     */
    @JsonProperty("sender")
    private String sender;
    
    /**
     * required true
     */
    @JsonProperty("tls")
    private Boolean tls;
    
    @JsonProperty("username")
    private String username;
    
    public String getDefaultRecipient() {
        return this.defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
      this.defaultRecipient = defaultRecipient;
    }
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
      this.sender = sender;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
