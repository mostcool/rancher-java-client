package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class SourceCodeRepository extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("defaultBranch")
    private String defaultBranch;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("language")
    private String language;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("permissions")
    private RepoPerm permissions;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("sourceCodeCredentialId")
    private String sourceCodeCredentialId;
    
    /**
     * required true
     */
    @JsonProperty("sourceCodeType")
    private String sourceCodeType;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private SourceCodeRepositoryStatus status;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("url")
    private String url;
    
    /**
     * required true
     */
    @JsonProperty("userId")
    private String userId;
    
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
    
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
      this.defaultBranch = defaultBranch;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
      this.language = language;
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
    
    public RepoPerm getPermissions() {
        return this.permissions;
    }

    public void setPermissions(RepoPerm permissions) {
      this.permissions = permissions;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getSourceCodeCredentialId() {
        return this.sourceCodeCredentialId;
    }

    public void setSourceCodeCredentialId(String sourceCodeCredentialId) {
      this.sourceCodeCredentialId = sourceCodeCredentialId;
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
    
    public SourceCodeRepositoryStatus getStatus() {
        return this.status;
    }

    public void setStatus(SourceCodeRepositoryStatus status) {
      this.status = status;
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
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
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
