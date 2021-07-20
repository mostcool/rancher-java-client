package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class ClusterAlert extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    /**
     * required true
     */
    @JsonProperty("displayName")
    private String displayName;
    
    /**
     * required true
     */
    @JsonProperty("initialWaitSeconds")
    private Integer initialWaitSeconds;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
    @JsonProperty("recipients")
    private List<Recipient> recipients;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("repeatIntervalSeconds")
    private Integer repeatIntervalSeconds;
    
    /**
     * required true
     */
    @JsonProperty("severity")
    private String severity;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private AlertStatus status;
    
    @JsonProperty("targetEvent")
    private TargetEvent targetEvent;
    
    @JsonProperty("targetNode")
    private TargetNode targetNode;
    
    @JsonProperty("targetSystemService")
    private TargetSystemService targetSystemService;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public Integer getInitialWaitSeconds() {
        return this.initialWaitSeconds;
    }

    public void setInitialWaitSeconds(Integer initialWaitSeconds) {
      this.initialWaitSeconds = initialWaitSeconds;
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
    
    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
      this.severity = severity;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public AlertStatus getStatus() {
        return this.status;
    }

    public void setStatus(AlertStatus status) {
      this.status = status;
    }
    
    public TargetEvent getTargetEvent() {
        return this.targetEvent;
    }

    public void setTargetEvent(TargetEvent targetEvent) {
      this.targetEvent = targetEvent;
    }
    
    public TargetNode getTargetNode() {
        return this.targetNode;
    }

    public void setTargetNode(TargetNode targetNode) {
      this.targetNode = targetNode;
    }
    
    public TargetSystemService getTargetSystemService() {
        return this.targetSystemService;
    }

    public void setTargetSystemService(TargetSystemService targetSystemService) {
      this.targetSystemService = targetSystemService;
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
