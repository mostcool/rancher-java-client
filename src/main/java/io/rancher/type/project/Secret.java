package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class Secret extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("data")
    private Map<String, Object> data;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("immutable")
    private Boolean immutable;
    
    @JsonProperty("kind")
    private String kind;
    
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
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("stringData")
    private Map<String, Object> stringData;
    
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
    
    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> data) {
      this.data = data;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getImmutable() {
        return this.immutable;
    }

    public void setImmutable(Boolean immutable) {
      this.immutable = immutable;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
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
    
    public Map<String, Object> getStringData() {
        return this.stringData;
    }

    public void setStringData(Map<String, Object> stringData) {
      this.stringData = stringData;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
