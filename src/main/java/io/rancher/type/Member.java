package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Member extends AbstractType {
    
    @JsonProperty("accessType")
    private String accessType;
    
    @JsonProperty("groupPrincipalId")
    private String groupPrincipalId;
    
    @JsonProperty("userPrincipalId")
    private String userPrincipalId;
    
    public String getAccessType() {
        return this.accessType;
    }

    public void setAccessType(String accessType) {
      this.accessType = accessType;
    }
    
    public String getGroupPrincipalId() {
        return this.groupPrincipalId;
    }

    public void setGroupPrincipalId(String groupPrincipalId) {
      this.groupPrincipalId = groupPrincipalId;
    }
    
    public String getUserPrincipalId() {
        return this.userPrincipalId;
    }

    public void setUserPrincipalId(String userPrincipalId) {
      this.userPrincipalId = userPrincipalId;
    }
    
}
