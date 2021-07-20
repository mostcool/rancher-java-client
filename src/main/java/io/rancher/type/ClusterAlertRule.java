package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class ClusterAlertRule extends AbstractType {
    
    @JsonProperty("alertState")
    private String alertState;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("clusterScanRule")
    private ClusterScanRule clusterScanRule;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("eventRule")
    private EventRule eventRule;
    
    @JsonProperty("groupId")
    private String groupId;
    
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
    
    @JsonProperty("inherited")
    private Boolean inherited;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("metricRule")
    private MetricRule metricRule;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("nodeRule")
    private NodeRule nodeRule;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
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
    
    @JsonProperty("systemServiceRule")
    private SystemServiceRule systemServiceRule;
    
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
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public ClusterScanRule getClusterScanRule() {
        return this.clusterScanRule;
    }

    public void setClusterScanRule(ClusterScanRule clusterScanRule) {
      this.clusterScanRule = clusterScanRule;
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
    
    public EventRule getEventRule() {
        return this.eventRule;
    }

    public void setEventRule(EventRule eventRule) {
      this.eventRule = eventRule;
    }
    
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
      this.groupId = groupId;
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
    
    public Boolean getInherited() {
        return this.inherited;
    }

    public void setInherited(Boolean inherited) {
      this.inherited = inherited;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public MetricRule getMetricRule() {
        return this.metricRule;
    }

    public void setMetricRule(MetricRule metricRule) {
      this.metricRule = metricRule;
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
    
    public NodeRule getNodeRule() {
        return this.nodeRule;
    }

    public void setNodeRule(NodeRule nodeRule) {
      this.nodeRule = nodeRule;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
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
    
    public SystemServiceRule getSystemServiceRule() {
        return this.systemServiceRule;
    }

    public void setSystemServiceRule(SystemServiceRule systemServiceRule) {
      this.systemServiceRule = systemServiceRule;
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
