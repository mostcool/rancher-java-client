package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class ProjectAlertGroup extends AbstractType {
    
    @JsonProperty("alertState")
    private String alertState;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    /**
     * required true
     */
    @JsonProperty("groupIntervalSeconds")
    private Integer groupIntervalSeconds;
    
    /**
     * required true
     */
    @JsonProperty("groupWaitSeconds")
    private Integer groupWaitSeconds;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    /**
     * required true
     */
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("recipients")
    private List<Recipient> recipients;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("repeatIntervalSeconds")
    private Integer repeatIntervalSeconds;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public String getAlertState() {
        return this.alertState;
    }

    public void setAlertState(String alertState) {
      this.alertState = alertState;
    }
    
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Integer getGroupIntervalSeconds() {
        return this.groupIntervalSeconds;
    }

    public void setGroupIntervalSeconds(Integer groupIntervalSeconds) {
      this.groupIntervalSeconds = groupIntervalSeconds;
    }
    
    public Integer getGroupWaitSeconds() {
        return this.groupWaitSeconds;
    }

    public void setGroupWaitSeconds(Integer groupWaitSeconds) {
      this.groupWaitSeconds = groupWaitSeconds;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
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
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public List<Recipient> getRecipients() {
        return this.recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
      this.recipients = recipients;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Integer getRepeatIntervalSeconds() {
        return this.repeatIntervalSeconds;
    }

    public void setRepeatIntervalSeconds(Integer repeatIntervalSeconds) {
      this.repeatIntervalSeconds = repeatIntervalSeconds;
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
