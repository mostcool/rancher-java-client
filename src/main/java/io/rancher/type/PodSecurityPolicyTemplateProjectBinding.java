package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class PodSecurityPolicyTemplateProjectBinding extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
    @JsonProperty("podSecurityPolicyTemplateId")
    private String podSecurityPolicyTemplateId;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("targetProjectId")
    private String targetProjectId;
    
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
    
    public String getPodSecurityPolicyTemplateId() {
        return this.podSecurityPolicyTemplateId;
    }

    public void setPodSecurityPolicyTemplateId(String podSecurityPolicyTemplateId) {
      this.podSecurityPolicyTemplateId = podSecurityPolicyTemplateId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getTargetProjectId() {
        return this.targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
      this.targetProjectId = targetProjectId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}