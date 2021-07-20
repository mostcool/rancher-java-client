package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class GlobalDns extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    /**
     * required true
     */
    @JsonProperty("fqdn")
    private String fqdn;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("members")
    private List<Member> members;
    
    @JsonProperty("multiClusterAppId")
    private String multiClusterAppId;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectIds")
    private List<String> projectIds;
    
    /**
     * required true
     */
    @JsonProperty("providerId")
    private String providerId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private GlobalDnsStatus status;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("ttl")
    private Integer ttl;
    
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
    
    public String getFqdn() {
        return this.fqdn;
    }

    public void setFqdn(String fqdn) {
      this.fqdn = fqdn;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<Member> getMembers() {
        return this.members;
    }

    public void setMembers(List<Member> members) {
      this.members = members;
    }
    
    public String getMultiClusterAppId() {
        return this.multiClusterAppId;
    }

    public void setMultiClusterAppId(String multiClusterAppId) {
      this.multiClusterAppId = multiClusterAppId;
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
    
    public List<String> getProjectIds() {
        return this.projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
      this.projectIds = projectIds;
    }
    
    public String getProviderId() {
        return this.providerId;
    }

    public void setProviderId(String providerId) {
      this.providerId = providerId;
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
    
    public GlobalDnsStatus getStatus() {
        return this.status;
    }

    public void setStatus(GlobalDnsStatus status) {
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
    
    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
      this.ttl = ttl;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
