package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class NodePool extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("controlPlane")
    private Boolean controlPlane;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("deleteNotReadyAfterSecs")
    private Integer deleteNotReadyAfterSecs;
    
    @JsonProperty("displayName")
    private String displayName;
    
    @JsonProperty("driver")
    private String driver;
    
    @JsonProperty("etcd")
    private Boolean etcd;
    
    /**
     * required true
     */
    @JsonProperty("hostnamePrefix")
    private String hostnamePrefix;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("nodeAnnotations")
    private Map<String, Object> nodeAnnotations;
    
    @JsonProperty("nodeLabels")
    private Map<String, Object> nodeLabels;
    
    @JsonProperty("nodeTaints")
    private List<Taint> nodeTaints;
    
    /**
     * required true
     */
    @JsonProperty("nodeTemplateId")
    private String nodeTemplateId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
    @JsonProperty("quantity")
    private Integer quantity;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private NodePoolStatus status;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("worker")
    private Boolean worker;
    
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
    
    public Boolean getControlPlane() {
        return this.controlPlane;
    }

    public void setControlPlane(Boolean controlPlane) {
      this.controlPlane = controlPlane;
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
    
    public Integer getDeleteNotReadyAfterSecs() {
        return this.deleteNotReadyAfterSecs;
    }

    public void setDeleteNotReadyAfterSecs(Integer deleteNotReadyAfterSecs) {
      this.deleteNotReadyAfterSecs = deleteNotReadyAfterSecs;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Boolean getEtcd() {
        return this.etcd;
    }

    public void setEtcd(Boolean etcd) {
      this.etcd = etcd;
    }
    
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    public void setHostnamePrefix(String hostnamePrefix) {
      this.hostnamePrefix = hostnamePrefix;
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
    
    public Map<String, Object> getNodeAnnotations() {
        return this.nodeAnnotations;
    }

    public void setNodeAnnotations(Map<String, Object> nodeAnnotations) {
      this.nodeAnnotations = nodeAnnotations;
    }
    
    public Map<String, Object> getNodeLabels() {
        return this.nodeLabels;
    }

    public void setNodeLabels(Map<String, Object> nodeLabels) {
      this.nodeLabels = nodeLabels;
    }
    
    public List<Taint> getNodeTaints() {
        return this.nodeTaints;
    }

    public void setNodeTaints(List<Taint> nodeTaints) {
      this.nodeTaints = nodeTaints;
    }
    
    public String getNodeTemplateId() {
        return this.nodeTemplateId;
    }

    public void setNodeTemplateId(String nodeTemplateId) {
      this.nodeTemplateId = nodeTemplateId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
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
    
    public NodePoolStatus getStatus() {
        return this.status;
    }

    public void setStatus(NodePoolStatus status) {
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Boolean getWorker() {
        return this.worker;
    }

    public void setWorker(Boolean worker) {
      this.worker = worker;
    }
    
}
