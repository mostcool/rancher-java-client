package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class HorizontalPodAutoscaler extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("behavior")
    private HorizontalPodAutoscalerBehavior behavior;
    
    @JsonProperty("conditions")
    private List<HorizontalPodAutoscalerCondition> conditions;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("currentReplicas")
    private Integer currentReplicas;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("desiredReplicas")
    private Integer desiredReplicas;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("lastScaleTime")
    private String lastScaleTime;
    
    /**
     * required true
     */
    @JsonProperty("maxReplicas")
    private Integer maxReplicas;
    
    @JsonProperty("metrics")
    private List<Metric> metrics;
    
    @JsonProperty("minReplicas")
    private Integer minReplicas;
    
    @JsonProperty("name")
    private String name;
    
    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("observedGeneration")
    private Integer observedGeneration;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    /**
     * required true
     */
    @JsonProperty("workloadId")
    private String workloadId;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public HorizontalPodAutoscalerBehavior getBehavior() {
        return this.behavior;
    }

    public void setBehavior(HorizontalPodAutoscalerBehavior behavior) {
      this.behavior = behavior;
    }
    
    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<HorizontalPodAutoscalerCondition> conditions) {
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
    
    public Integer getCurrentReplicas() {
        return this.currentReplicas;
    }

    public void setCurrentReplicas(Integer currentReplicas) {
      this.currentReplicas = currentReplicas;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Integer getDesiredReplicas() {
        return this.desiredReplicas;
    }

    public void setDesiredReplicas(Integer desiredReplicas) {
      this.desiredReplicas = desiredReplicas;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastScaleTime() {
        return this.lastScaleTime;
    }

    public void setLastScaleTime(String lastScaleTime) {
      this.lastScaleTime = lastScaleTime;
    }
    
    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
      this.maxReplicas = maxReplicas;
    }
    
    public List<Metric> getMetrics() {
        return this.metrics;
    }

    public void setMetrics(List<Metric> metrics) {
      this.metrics = metrics;
    }
    
    public Integer getMinReplicas() {
        return this.minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
      this.minReplicas = minReplicas;
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
    
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
      this.observedGeneration = observedGeneration;
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
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
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
    
    public String getWorkloadId() {
        return this.workloadId;
    }

    public void setWorkloadId(String workloadId) {
      this.workloadId = workloadId;
    }
    
}
