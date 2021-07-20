package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class OwnerReference extends AbstractType {
    
    @JsonProperty("apiVersion")
    private String apiVersion;
    
    @JsonProperty("blockOwnerDeletion")
    private Boolean blockOwnerDeletion;
    
    @JsonProperty("controller")
    private Boolean controller;
    
    @JsonProperty("kind")
    private String kind;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("uid")
    private String uid;
    
    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
    }
    
    public Boolean getBlockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }

    public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
      this.blockOwnerDeletion = blockOwnerDeletion;
    }
    
    public Boolean getController() {
        return this.controller;
    }

    public void setController(Boolean controller) {
      this.controller = controller;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
      this.uid = uid;
    }
    
}
