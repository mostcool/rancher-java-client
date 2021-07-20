package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class PipelineExecution extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("author")
    private String author;
    
    @JsonProperty("avatarUrl")
    private String avatarUrl;
    
    @JsonProperty("branch")
    private String branch;
    
    @JsonProperty("commit")
    private String commit;
    
    @JsonProperty("conditions")
    private List<PipelineCondition> conditions;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("ended")
    private String ended;
    
    @JsonProperty("event")
    private String event;
    
    @JsonProperty("executionState")
    private String executionState;
    
    @JsonProperty("htmlLink")
    private String htmlLink;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
    @JsonProperty("pipelineConfig")
    private PipelineConfig pipelineConfig;
    
    /**
     * required true
     */
    @JsonProperty("pipelineId")
    private String pipelineId;
    
    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("ref")
    private String ref;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("repositoryUrl")
    private String repositoryUrl;
    
    /**
     * required true
     */
    @JsonProperty("run")
    private Integer run;
    
    @JsonProperty("stages")
    private List<StageStatus> stages;
    
    @JsonProperty("started")
    private String started;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("triggerUserId")
    private String triggerUserId;
    
    /**
     * required true
     */
    @JsonProperty("triggeredBy")
    private String triggeredBy;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }
    
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
    }
    
    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
      this.branch = branch;
    }
    
    public String getCommit() {
        return this.commit;
    }

    public void setCommit(String commit) {
      this.commit = commit;
    }
    
    public List<PipelineCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<PipelineCondition> conditions) {
      this.conditions = conditions;
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
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
      this.email = email;
    }
    
    public String getEnded() {
        return this.ended;
    }

    public void setEnded(String ended) {
      this.ended = ended;
    }
    
    public String getEvent() {
        return this.event;
    }

    public void setEvent(String event) {
      this.event = event;
    }
    
    public String getExecutionState() {
        return this.executionState;
    }

    public void setExecutionState(String executionState) {
      this.executionState = executionState;
    }
    
    public String getHtmlLink() {
        return this.htmlLink;
    }

    public void setHtmlLink(String htmlLink) {
      this.htmlLink = htmlLink;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
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
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public PipelineConfig getPipelineConfig() {
        return this.pipelineConfig;
    }

    public void setPipelineConfig(PipelineConfig pipelineConfig) {
      this.pipelineConfig = pipelineConfig;
    }
    
    public String getPipelineId() {
        return this.pipelineId;
    }

    public void setPipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
      this.ref = ref;
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
    
    public Integer getRun() {
        return this.run;
    }

    public void setRun(Integer run) {
      this.run = run;
    }
    
    public List<StageStatus> getStages() {
        return this.stages;
    }

    public void setStages(List<StageStatus> stages) {
      this.stages = stages;
    }
    
    public String getStarted() {
        return this.started;
    }

    public void setStarted(String started) {
      this.started = started;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
      this.title = title;
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
    
    public String getTriggerUserId() {
        return this.triggerUserId;
    }

    public void setTriggerUserId(String triggerUserId) {
      this.triggerUserId = triggerUserId;
    }
    
    public String getTriggeredBy() {
        return this.triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
      this.triggeredBy = triggeredBy;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
