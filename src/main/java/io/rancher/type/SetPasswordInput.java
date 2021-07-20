package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SetPasswordInput extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("newPassword")
    private String newPassword;
    
    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    
}
