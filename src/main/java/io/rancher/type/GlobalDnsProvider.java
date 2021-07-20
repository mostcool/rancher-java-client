package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class GlobalDnsProvider extends AbstractType {
    
    @JsonProperty("alidnsProviderConfig")
    private AlidnsProviderConfig alidnsProviderConfig;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("cloudflareProviderConfig")
    private CloudflareProviderConfig cloudflareProviderConfig;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("members")
    private List<Member> members;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("rootDomain")
    private String rootDomain;
    
    @JsonProperty("route53ProviderConfig")
    private Route53ProviderConfig route53providerConfig;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public AlidnsProviderConfig getAlidnsProviderConfig() {
        return this.alidnsProviderConfig;
    }

    public void setAlidnsProviderConfig(AlidnsProviderConfig alidnsProviderConfig) {
      this.alidnsProviderConfig = alidnsProviderConfig;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public CloudflareProviderConfig getCloudflareProviderConfig() {
        return this.cloudflareProviderConfig;
    }

    public void setCloudflareProviderConfig(CloudflareProviderConfig cloudflareProviderConfig) {
      this.cloudflareProviderConfig = cloudflareProviderConfig;
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
    
    public List<Member> getMembers() {
        return this.members;
    }

    public void setMembers(List<Member> members) {
      this.members = members;
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
    
    public String getRootDomain() {
        return this.rootDomain;
    }

    public void setRootDomain(String rootDomain) {
      this.rootDomain = rootDomain;
    }
    
    public Route53ProviderConfig getRoute53providerConfig() {
        return this.route53providerConfig;
    }

    public void setRoute53providerConfig(Route53ProviderConfig route53providerConfig) {
      this.route53providerConfig = route53providerConfig;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
