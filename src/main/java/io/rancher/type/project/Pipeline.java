package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Pipeline extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("lastExecutionId")
    private String lastExecutionId;
    
    @JsonProperty("lastRunState")
    private String lastRunState;
    
    @JsonProperty("lastStarted")
    private String lastStarted;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("nextRun")
    private Integer nextRun;
    
    @JsonProperty("nextStart")
    private String nextStart;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
    @JsonProperty("pipelineState")
    private String pipelineState;
    
    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("repositoryUrl")
    private String repositoryUrl;
    
    @JsonProperty("sourceCodeCredential")
    private SourceCodeCredential sourceCodeCredential;
    
    @JsonProperty("sourceCodeCredentialId")
    private String sourceCodeCredentialId;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("token")
    private String token;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("triggerWebhookPr")
    private Boolean triggerWebhookPr;
    
    @JsonProperty("triggerWebhookPush")
    private Boolean triggerWebhookPush;
    
    @JsonProperty("triggerWebhookTag")
    private Boolean triggerWebhookTag;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("webhookId")
    private String webhookId;
    
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
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastExecutionId() {
        return this.lastExecutionId;
    }

    public void setLastExecutionId(String lastExecutionId) {
      this.lastExecutionId = lastExecutionId;
    }
    
    public String getLastRunState() {
        return this.lastRunState;
    }

    public void setLastRunState(String lastRunState) {
      this.lastRunState = lastRunState;
    }
    
    public String getLastStarted() {
        return this.lastStarted;
    }

    public void setLastStarted(String lastStarted) {
      this.lastStarted = lastStarted;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public Integer getNextRun() {
        return this.nextRun;
    }

    public void setNextRun(Integer nextRun) {
      this.nextRun = nextRun;
    }
    
    public String getNextStart() {
        return this.nextStart;
    }

    public void setNextStart(String nextStart) {
      this.nextStart = nextStart;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getPipelineState() {
        return this.pipelineState;
    }

    public void setPipelineState(String pipelineState) {
      this.pipelineState = pipelineState;
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
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
      this.repositoryUrl = repositoryUrl;
    }
    
    public SourceCodeCredential getSourceCodeCredential() {
        return this.sourceCodeCredential;
    }

    public void setSourceCodeCredential(SourceCodeCredential sourceCodeCredential) {
      this.sourceCodeCredential = sourceCodeCredential;
    }
    
    public String getSourceCodeCredentialId() {
        return this.sourceCodeCredentialId;
    }

    public void setSourceCodeCredentialId(String sourceCodeCredentialId) {
      this.sourceCodeCredentialId = sourceCodeCredentialId;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
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
    
    public Boolean getTriggerWebhookPr() {
        return this.triggerWebhookPr;
    }

    public void setTriggerWebhookPr(Boolean triggerWebhookPr) {
      this.triggerWebhookPr = triggerWebhookPr;
    }
    
    public Boolean getTriggerWebhookPush() {
        return this.triggerWebhookPush;
    }

    public void setTriggerWebhookPush(Boolean triggerWebhookPush) {
      this.triggerWebhookPush = triggerWebhookPush;
    }
    
    public Boolean getTriggerWebhookTag() {
        return this.triggerWebhookTag;
    }

    public void setTriggerWebhookTag(Boolean triggerWebhookTag) {
      this.triggerWebhookTag = triggerWebhookTag;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getWebhookId() {
        return this.webhookId;
    }

    public void setWebhookId(String webhookId) {
      this.webhookId = webhookId;
    }
    
}
