package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class GithubConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;
    
    @JsonProperty("additionalClientIds")
    private Map<String, Object> additionalClientIds;
    
    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    /**
     * required true
     */
    @JsonProperty("clientId")
    private String clientId;
    
    /**
     * required true
     */
    @JsonProperty("clientSecret")
    private String clientSecret;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("hostnameToClientId")
    private Map<String, Object> hostnameToClientId;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("tls")
    private Boolean tls;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
    public Map<String, Object> getAdditionalClientIds() {
        return this.additionalClientIds;
    }

    public void setAdditionalClientIds(Map<String, Object> additionalClientIds) {
      this.additionalClientIds = additionalClientIds;
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
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
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
    
    public Map<String, Object> getHostnameToClientId() {
        return this.hostnameToClientId;
    }

    public void setHostnameToClientId(Map<String, Object> hostnameToClientId) {
      this.hostnameToClientId = hostnameToClientId;
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
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
