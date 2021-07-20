package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangePasswordInput extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("currentPassword")
    private String currentPassword;
    
    /**
     * required true
     */
    @JsonProperty("newPassword")
    private String newPassword;
    
    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
      this.currentPassword = currentPassword;
    }
    
    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    
}
