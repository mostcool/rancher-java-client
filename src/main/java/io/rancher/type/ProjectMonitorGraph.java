package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class ProjectMonitorGraph extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("detailsMetricsSelector")
    private Map<String, Object> detailsMetricsSelector;
    
    @JsonProperty("displayResourceType")
    private String displayResourceType;
    
    @JsonProperty("graphType")
    private String graphType;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("metricsSelector")
    private Map<String, Object> metricsSelector;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("priority")
    private Integer priority;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("resourceType")
    private String resourceType;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("yAxis")
    private YAxis yaxis;
    
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
    
    public Map<String, Object> getDetailsMetricsSelector() {
        return this.detailsMetricsSelector;
    }

    public void setDetailsMetricsSelector(Map<String, Object> detailsMetricsSelector) {
      this.detailsMetricsSelector = detailsMetricsSelector;
    }
    
    public String getDisplayResourceType() {
        return this.displayResourceType;
    }

    public void setDisplayResourceType(String displayResourceType) {
      this.displayResourceType = displayResourceType;
    }
    
    public String getGraphType() {
        return this.graphType;
    }

    public void setGraphType(String graphType) {
      this.graphType = graphType;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Map<String, Object> getMetricsSelector() {
        return this.metricsSelector;
    }

    public void setMetricsSelector(Map<String, Object> metricsSelector) {
      this.metricsSelector = metricsSelector;
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
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
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
    
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public YAxis getYaxis() {
        return this.yaxis;
    }

    public void setYaxis(YAxis yaxis) {
      this.yaxis = yaxis;
    }
    
}
