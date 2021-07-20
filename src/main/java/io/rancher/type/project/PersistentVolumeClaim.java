package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class PersistentVolumeClaim extends AbstractType {
    
    @JsonProperty("accessModes")
    private List<String> accessModes;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("dataSource")
    private TypedLocalObjectReference dataSource;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    /**
     * required true
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("resources")
    private ResourceRequirements resources;
    
    @JsonProperty("selector")
    private LabelSelector selector;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private PersistentVolumeClaimStatus status;
    
    @JsonProperty("storageClassId")
    private String storageClassId;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("volumeId")
    private String volumeId;
    
    @JsonProperty("volumeMode")
    private String volumeMode;
    
    public List<String> getAccessModes() {
        return this.accessModes;
    }

    public void setAccessModes(List<String> accessModes) {
      this.accessModes = accessModes;
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
    
    public TypedLocalObjectReference getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(TypedLocalObjectReference dataSource) {
      this.dataSource = dataSource;
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
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public ResourceRequirements getResources() {
        return this.resources;
    }

    public void setResources(ResourceRequirements resources) {
      this.resources = resources;
    }
    
    public LabelSelector getSelector() {
        return this.selector;
    }

    public void setSelector(LabelSelector selector) {
      this.selector = selector;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public PersistentVolumeClaimStatus getStatus() {
        return this.status;
    }

    public void setStatus(PersistentVolumeClaimStatus status) {
      this.status = status;
    }
    
    public String getStorageClassId() {
        return this.storageClassId;
    }

    public void setStorageClassId(String storageClassId) {
      this.storageClassId = storageClassId;
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
    
    public String getVolumeId() {
        return this.volumeId;
    }

    public void setVolumeId(String volumeId) {
      this.volumeId = volumeId;
    }
    
    public String getVolumeMode() {
        return this.volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
      this.volumeMode = volumeMode;
    }
    
}
