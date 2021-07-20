package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class ProjectRoleTemplateBinding extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("groupId")
    private String groupId;
    
    @JsonProperty("groupPrincipalId")
    private String groupPrincipalId;
    
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
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("roleTemplateId")
    private String roleTemplateId;
    
    @JsonProperty("serviceAccount")
    private String serviceAccount;
    
    @JsonProperty("userId")
    private String userId;
    
    @JsonProperty("userPrincipalId")
    private String userPrincipalId;
    
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
    
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
      this.groupId = groupId;
    }
    
    public String getGroupPrincipalId() {
        return this.groupPrincipalId;
    }

    public void setGroupPrincipalId(String groupPrincipalId) {
      this.groupPrincipalId = groupPrincipalId;
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
    
    public String getRoleTemplateId() {
        return this.roleTemplateId;
    }

    public void setRoleTemplateId(String roleTemplateId) {
      this.roleTemplateId = roleTemplateId;
    }
    
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
      this.serviceAccount = serviceAccount;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUserPrincipalId() {
        return this.userPrincipalId;
    }

    public void setUserPrincipalId(String userPrincipalId) {
      this.userPrincipalId = userPrincipalId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
