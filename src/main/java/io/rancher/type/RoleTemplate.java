package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class RoleTemplate extends AbstractType {
    
    @JsonProperty("administrative")
    private Boolean administrative;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("builtin")
    private Boolean builtin;
    
    /**
     * required true
     */
    @JsonProperty("clusterCreatorDefault")
    private Boolean clusterCreatorDefault;
    
    @JsonProperty("context")
    private String context;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("external")
    private Boolean external;
    
    @JsonProperty("hidden")
    private Boolean hidden;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("locked")
    private Boolean locked;
    
    /**
     * required true
     */
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
    @JsonProperty("projectCreatorDefault")
    private Boolean projectCreatorDefault;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("roleTemplateIds")
    private List<String> roleTemplateIds;
    
    @JsonProperty("rules")
    private List<PolicyRule> rules;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public Boolean getAdministrative() {
        return this.administrative;
    }

    public void setAdministrative(Boolean administrative) {
      this.administrative = administrative;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Boolean getBuiltin() {
        return this.builtin;
    }

    public void setBuiltin(Boolean builtin) {
      this.builtin = builtin;
    }
    
    public Boolean getClusterCreatorDefault() {
        return this.clusterCreatorDefault;
    }

    public void setClusterCreatorDefault(Boolean clusterCreatorDefault) {
      this.clusterCreatorDefault = clusterCreatorDefault;
    }
    
    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
      this.context = context;
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
    
    public Boolean getExternal() {
        return this.external;
    }

    public void setExternal(Boolean external) {
      this.external = external;
    }
    
    public Boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(Boolean hidden) {
      this.hidden = hidden;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Boolean getLocked() {
        return this.locked;
    }

    public void setLocked(Boolean locked) {
      this.locked = locked;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Boolean getProjectCreatorDefault() {
        return this.projectCreatorDefault;
    }

    public void setProjectCreatorDefault(Boolean projectCreatorDefault) {
      this.projectCreatorDefault = projectCreatorDefault;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getRoleTemplateIds() {
        return this.roleTemplateIds;
    }

    public void setRoleTemplateIds(List<String> roleTemplateIds) {
      this.roleTemplateIds = roleTemplateIds;
    }
    
    public List<PolicyRule> getRules() {
        return this.rules;
    }

    public void setRules(List<PolicyRule> rules) {
      this.rules = rules;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
