package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class GoogleOauthConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;
    
    /**
     * required true
     */
    @JsonProperty("adminEmail")
    private String adminEmail;
    
    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    /**
     * required true
     */
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nestedGroupMembershipEnabled")
    private Boolean nestedGroupMembershipEnabled;
    
    /**
     * required true
     */
    @JsonProperty("oauthCredential")
    private String oauthCredential;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("removed")
    private String removed;
    
    /**
     * required true
     */
    @JsonProperty("serviceAccountCredential")
    private String serviceAccountCredential;
    
    @JsonProperty("type")
    private String type;
    
    /**
     * required true
     */
    @JsonProperty("userInfoEndpoint")
    private String userInfoEndpoint;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
    public String getAdminEmail() {
        return this.adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
      this.adminEmail = adminEmail;
    }
    
    public List<String> getAllowedPrincipalIds() {
        return this.allowedPrincipalIds;
    }

    public void setAllowedPrincipalIds(List<String> allowedPrincipalIds) {
      this.allowedPrincipalIds = allowedPrincipalIds;
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
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
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
    
    public Boolean getNestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }

    public void setNestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
      this.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
    }
    
    public String getOauthCredential() {
        return this.oauthCredential;
    }

    public void setOauthCredential(String oauthCredential) {
      this.oauthCredential = oauthCredential;
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
    
    public String getServiceAccountCredential() {
        return this.serviceAccountCredential;
    }

    public void setServiceAccountCredential(String serviceAccountCredential) {
      this.serviceAccountCredential = serviceAccountCredential;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public void setUserInfoEndpoint(String userInfoEndpoint) {
      this.userInfoEndpoint = userInfoEndpoint;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
