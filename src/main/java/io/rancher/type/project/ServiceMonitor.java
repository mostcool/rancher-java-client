package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class ServiceMonitor extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("endpoints")
    private List<Endpoint> endpoints;
    
    @JsonProperty("jobLabel")
    private String jobLabel;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("namespaceSelector")
    private List<String> namespaceSelector;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("podTargetLabels")
    private List<String> podTargetLabels;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("sampleLimit")
    private Integer sampleLimit;
    
    @JsonProperty("selector")
    private LabelSelector selector;
    
    @JsonProperty("targetLabels")
    private List<String> targetLabels;
    
    @JsonProperty("targetService")
    private String targetService;
    
    @JsonProperty("targetWorkload")
    private String targetWorkload;
    
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
    
    public List<Endpoint> getEndpoints() {
        return this.endpoints;
    }

    public void setEndpoints(List<Endpoint> endpoints) {
      this.endpoints = endpoints;
    }
    
    public String getJobLabel() {
        return this.jobLabel;
    }

    public void setJobLabel(String jobLabel) {
      this.jobLabel = jobLabel;
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
    
    public List<String> getNamespaceSelector() {
        return this.namespaceSelector;
    }

    public void setNamespaceSelector(List<String> namespaceSelector) {
      this.namespaceSelector = namespaceSelector;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public List<String> getPodTargetLabels() {
        return this.podTargetLabels;
    }

    public void setPodTargetLabels(List<String> podTargetLabels) {
      this.podTargetLabels = podTargetLabels;
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
    
    public Integer getSampleLimit() {
        return this.sampleLimit;
    }

    public void setSampleLimit(Integer sampleLimit) {
      this.sampleLimit = sampleLimit;
    }
    
    public LabelSelector getSelector() {
        return this.selector;
    }

    public void setSelector(LabelSelector selector) {
      this.selector = selector;
    }
    
    public List<String> getTargetLabels() {
        return this.targetLabels;
    }

    public void setTargetLabels(List<String> targetLabels) {
      this.targetLabels = targetLabels;
    }
    
    public String getTargetService() {
        return this.targetService;
    }

    public void setTargetService(String targetService) {
      this.targetService = targetService;
    }
    
    public String getTargetWorkload() {
        return this.targetWorkload;
    }

    public void setTargetWorkload(String targetWorkload) {
      this.targetWorkload = targetWorkload;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
