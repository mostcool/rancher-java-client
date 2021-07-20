package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Principal extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("extraInfo")
    private Map<String, Object> extraInfo;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("loginName")
    private String loginName;
    
    @JsonProperty("me")
    private Boolean me;
    
    @JsonProperty("memberOf")
    private Boolean memberOf;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("principalType")
    private String principalType;
    
    @JsonProperty("profilePicture")
    private String profilePicture;
    
    @JsonProperty("profileURL")
    private String profileUrl;
    
    @JsonProperty("provider")
    private String provider;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public Map<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    public void setExtraInfo(Map<String, Object> extraInfo) {
      this.extraInfo = extraInfo;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
      this.loginName = loginName;
    }
    
    public Boolean getMe() {
        return this.me;
    }

    public void setMe(Boolean me) {
      this.me = me;
    }
    
    public Boolean getMemberOf() {
        return this.memberOf;
    }

    public void setMemberOf(Boolean memberOf) {
      this.memberOf = memberOf;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getPrincipalType() {
        return this.principalType;
    }

    public void setPrincipalType(String principalType) {
      this.principalType = principalType;
    }
    
    public String getProfilePicture() {
        return this.profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
      this.profilePicture = profilePicture;
    }
    
    public String getProfileUrl() {
        return this.profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
      this.profileUrl = profileUrl;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
