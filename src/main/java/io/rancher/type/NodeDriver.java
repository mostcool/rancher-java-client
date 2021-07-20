package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class NodeDriver extends AbstractType {
    
    @JsonProperty("active")
    private Boolean active;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("builtin")
    private Boolean builtin;
    
    @JsonProperty("checksum")
    private String checksum;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("externalId")
    private String externalId;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private NodeDriverStatus status;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uiUrl")
    private String uiUrl;
    
    /**
     * required true
     */
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("whitelistDomains")
    private List<String> whitelistDomains;
    
    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
      this.active = active;
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
    
    public String getChecksum() {
        return this.checksum;
    }

    public void setChecksum(String checksum) {
      this.checksum = checksum;
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
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
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
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public NodeDriverStatus getStatus() {
        return this.status;
    }

    public void setStatus(NodeDriverStatus status) {
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
    
    public String getUiUrl() {
        return this.uiUrl;
    }

    public void setUiUrl(String uiUrl) {
      this.uiUrl = uiUrl;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public List<String> getWhitelistDomains() {
        return this.whitelistDomains;
    }

    public void setWhitelistDomains(List<String> whitelistDomains) {
      this.whitelistDomains = whitelistDomains;
    }
    
}
