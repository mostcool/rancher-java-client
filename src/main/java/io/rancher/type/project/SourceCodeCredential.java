package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class SourceCodeCredential extends AbstractType {
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("avatarUrl")
    private String avatarUrl;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    /**
     * required true
     */
    @JsonProperty("displayName")
    private String displayName;
    
    @JsonProperty("expiry")
    private String expiry;
    
    @JsonProperty("gitCloneToken")
    private String gitCloneToken;
    
    @JsonProperty("gitLoginName")
    private String gitLoginName;
    
    @JsonProperty("htmlUrl")
    private String htmlUrl;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("loginName")
    private String loginName;
    
    @JsonProperty("logout")
    private Boolean logout;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("refreshToken")
    private String refreshToken;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("sourceCodeType")
    private String sourceCodeType;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    /**
     * required true
     */
    @JsonProperty("userId")
    private String userId;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
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
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getExpiry() {
        return this.expiry;
    }

    public void setExpiry(String expiry) {
      this.expiry = expiry;
    }
    
    public String getGitCloneToken() {
        return this.gitCloneToken;
    }

    public void setGitCloneToken(String gitCloneToken) {
      this.gitCloneToken = gitCloneToken;
    }
    
    public String getGitLoginName() {
        return this.gitLoginName;
    }

    public void setGitLoginName(String gitLoginName) {
      this.gitLoginName = gitLoginName;
    }
    
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
      this.htmlUrl = htmlUrl;
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
    
    public Boolean getLogout() {
        return this.logout;
    }

    public void setLogout(Boolean logout) {
      this.logout = logout;
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
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getSourceCodeType() {
        return this.sourceCodeType;
    }

    public void setSourceCodeType(String sourceCodeType) {
      this.sourceCodeType = sourceCodeType;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
