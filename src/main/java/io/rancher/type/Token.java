package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Token extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("authProvider")
    private String authProvider;
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("current")
    private Boolean current;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("expired")
    private Boolean expired;
    
    @JsonProperty("expiresAt")
    private String expiresAt;
    
    @JsonProperty("groupPrincipals")
    private List<String> groupPrincipals;
    
    @JsonProperty("isDerived")
    private Boolean isDerived;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("providerInfo")
    private Map<String, Object> providerInfo;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("token")
    private String token;
    
    @JsonProperty("ttl")
    private Integer ttl;
    
    @JsonProperty("userId")
    private String userId;
    
    @JsonProperty("userPrincipal")
    private String userPrincipal;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAuthProvider() {
        return this.authProvider;
    }

    public void setAuthProvider(String authProvider) {
      this.authProvider = authProvider;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
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
    
    public Boolean getCurrent() {
        return this.current;
    }

    public void setCurrent(Boolean current) {
      this.current = current;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Boolean getExpired() {
        return this.expired;
    }

    public void setExpired(Boolean expired) {
      this.expired = expired;
    }
    
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
    }
    
    public List<String> getGroupPrincipals() {
        return this.groupPrincipals;
    }

    public void setGroupPrincipals(List<String> groupPrincipals) {
      this.groupPrincipals = groupPrincipals;
    }
    
    public Boolean getIsDerived() {
        return this.isDerived;
    }

    public void setIsDerived(Boolean isDerived) {
      this.isDerived = isDerived;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
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
    
    public Map<String, Object> getProviderInfo() {
        return this.providerInfo;
    }

    public void setProviderInfo(Map<String, Object> providerInfo) {
      this.providerInfo = providerInfo;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
      this.ttl = ttl;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    public void setUserPrincipal(String userPrincipal) {
      this.userPrincipal = userPrincipal;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
