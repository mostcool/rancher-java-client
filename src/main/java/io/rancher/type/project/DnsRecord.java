package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class DnsRecord extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("clusterIp")
    private String clusterIp;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("ipAddresses")
    private List<String> ipAddresses;
    
    @JsonProperty("ipFamily")
    private String ipFamily;
    
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
    
    @JsonProperty("ports")
    private List<ServicePort> ports;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("selector")
    private Map<String, Object> selector;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("targetDnsRecordIds")
    private List<String> targetDnsRecordIds;
    
    @JsonProperty("targetWorkloadIds")
    private List<String> targetWorkloadIds;
    
    @JsonProperty("topologyKeys")
    private List<String> topologyKeys;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("workloadId")
    private String workloadId;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterIp() {
        return this.clusterIp;
    }

    public void setClusterIp(String clusterIp) {
      this.clusterIp = clusterIp;
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
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
      this.ipAddresses = ipAddresses;
    }
    
    public String getIpFamily() {
        return this.ipFamily;
    }

    public void setIpFamily(String ipFamily) {
      this.ipFamily = ipFamily;
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
    
    public List<ServicePort> getPorts() {
        return this.ports;
    }

    public void setPorts(List<ServicePort> ports) {
      this.ports = ports;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public List<PublicEndpoint> getPublicEndpoints() {
        return this.publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoint> publicEndpoints) {
      this.publicEndpoints = publicEndpoints;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Map<String, Object> getSelector() {
        return this.selector;
    }

    public void setSelector(Map<String, Object> selector) {
      this.selector = selector;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public List<String> getTargetDnsRecordIds() {
        return this.targetDnsRecordIds;
    }

    public void setTargetDnsRecordIds(List<String> targetDnsRecordIds) {
      this.targetDnsRecordIds = targetDnsRecordIds;
    }
    
    public List<String> getTargetWorkloadIds() {
        return this.targetWorkloadIds;
    }

    public void setTargetWorkloadIds(List<String> targetWorkloadIds) {
      this.targetWorkloadIds = targetWorkloadIds;
    }
    
    public List<String> getTopologyKeys() {
        return this.topologyKeys;
    }

    public void setTopologyKeys(List<String> topologyKeys) {
      this.topologyKeys = topologyKeys;
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
    
    public String getWorkloadId() {
        return this.workloadId;
    }

    public void setWorkloadId(String workloadId) {
      this.workloadId = workloadId;
    }
    
}
