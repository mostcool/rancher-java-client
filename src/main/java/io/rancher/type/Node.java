package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Node extends AbstractType {
    
    @JsonProperty("allocatable")
    private Map<String, Object> allocatable;
    
    @JsonProperty("amazonec2Config")
    private Amazonec2config amazonec2config;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("appliedNodeVersion")
    private Integer appliedNodeVersion;
    
    @JsonProperty("azureConfig")
    private Azureconfig azureConfig;
    
    @JsonProperty("capacity")
    private Map<String, Object> capacity;
    
    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("conditions")
    private List<NodeCondition> conditions;
    
    @JsonProperty("controlPlane")
    private Boolean controlPlane;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("customConfig")
    private CustomConfig customConfig;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("digitaloceanConfig")
    private Digitaloceanconfig digitaloceanConfig;
    
    @JsonProperty("dockerInfo")
    private DockerInfo dockerInfo;
    
    @JsonProperty("etcd")
    private Boolean etcd;
    
    @JsonProperty("externalIpAddress")
    private String externalIpAddress;
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("imported")
    private Boolean imported;
    
    @JsonProperty("info")
    private NodeInfo info;
    
    @JsonProperty("ipAddress")
    private String ipAddress;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("limits")
    private Map<String, Object> limits;
    
    @JsonProperty("linodeConfig")
    private Linodeconfig linodeConfig;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("nodeName")
    private String nodeName;
    
    @JsonProperty("nodePlan")
    private NodePlan nodePlan;
    
    @JsonProperty("nodePoolId")
    private String nodePoolId;
    
    @JsonProperty("nodeTaints")
    private List<Taint> nodeTaints;
    
    @JsonProperty("nodeTemplateId")
    private String nodeTemplateId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("podCidr")
    private String podCidr;
    
    @JsonProperty("podCidrs")
    private List<String> podCidrs;
    
    @JsonProperty("providerId")
    private String providerId;
    
    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("requested")
    private Map<String, Object> requested;
    
    /**
     * required true
     */
    @JsonProperty("requestedHostname")
    private String requestedHostname;
    
    @JsonProperty("sshUser")
    private String sshUser;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("taints")
    private List<Taint> taints;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("unschedulable")
    private Boolean unschedulable;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("vmwarevsphereConfig")
    private Vmwarevsphereconfig vmwarevsphereConfig;
    
    @JsonProperty("volumesAttached")
    private Map<String, Object> volumesAttached;
    
    @JsonProperty("volumesInUse")
    private List<String> volumesInUse;
    
    @JsonProperty("worker")
    private Boolean worker;
    
    public Map<String, Object> getAllocatable() {
        return this.allocatable;
    }

    public void setAllocatable(Map<String, Object> allocatable) {
      this.allocatable = allocatable;
    }
    
    public Amazonec2config getAmazonec2config() {
        return this.amazonec2config;
    }

    public void setAmazonec2config(Amazonec2config amazonec2config) {
      this.amazonec2config = amazonec2config;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Integer getAppliedNodeVersion() {
        return this.appliedNodeVersion;
    }

    public void setAppliedNodeVersion(Integer appliedNodeVersion) {
      this.appliedNodeVersion = appliedNodeVersion;
    }
    
    public Azureconfig getAzureConfig() {
        return this.azureConfig;
    }

    public void setAzureConfig(Azureconfig azureConfig) {
      this.azureConfig = azureConfig;
    }
    
    public Map<String, Object> getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
      this.capacity = capacity;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public List<NodeCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<NodeCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Boolean getControlPlane() {
        return this.controlPlane;
    }

    public void setControlPlane(Boolean controlPlane) {
      this.controlPlane = controlPlane;
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
    
    public CustomConfig getCustomConfig() {
        return this.customConfig;
    }

    public void setCustomConfig(CustomConfig customConfig) {
      this.customConfig = customConfig;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Digitaloceanconfig getDigitaloceanConfig() {
        return this.digitaloceanConfig;
    }

    public void setDigitaloceanConfig(Digitaloceanconfig digitaloceanConfig) {
      this.digitaloceanConfig = digitaloceanConfig;
    }
    
    public DockerInfo getDockerInfo() {
        return this.dockerInfo;
    }

    public void setDockerInfo(DockerInfo dockerInfo) {
      this.dockerInfo = dockerInfo;
    }
    
    public Boolean getEtcd() {
        return this.etcd;
    }

    public void setEtcd(Boolean etcd) {
      this.etcd = etcd;
    }
    
    public String getExternalIpAddress() {
        return this.externalIpAddress;
    }

    public void setExternalIpAddress(String externalIpAddress) {
      this.externalIpAddress = externalIpAddress;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public Boolean getImported() {
        return this.imported;
    }

    public void setImported(Boolean imported) {
      this.imported = imported;
    }
    
    public NodeInfo getInfo() {
        return this.info;
    }

    public void setInfo(NodeInfo info) {
      this.info = info;
    }
    
    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Map<String, Object> getLimits() {
        return this.limits;
    }

    public void setLimits(Map<String, Object> limits) {
      this.limits = limits;
    }
    
    public Linodeconfig getLinodeConfig() {
        return this.linodeConfig;
    }

    public void setLinodeConfig(Linodeconfig linodeConfig) {
      this.linodeConfig = linodeConfig;
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
    
    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
      this.nodeName = nodeName;
    }
    
    public NodePlan getNodePlan() {
        return this.nodePlan;
    }

    public void setNodePlan(NodePlan nodePlan) {
      this.nodePlan = nodePlan;
    }
    
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public void setNodePoolId(String nodePoolId) {
      this.nodePoolId = nodePoolId;
    }
    
    public List<Taint> getNodeTaints() {
        return this.nodeTaints;
    }

    public void setNodeTaints(List<Taint> nodeTaints) {
      this.nodeTaints = nodeTaints;
    }
    
    public String getNodeTemplateId() {
        return this.nodeTemplateId;
    }

    public void setNodeTemplateId(String nodeTemplateId) {
      this.nodeTemplateId = nodeTemplateId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getPodCidr() {
        return this.podCidr;
    }

    public void setPodCidr(String podCidr) {
      this.podCidr = podCidr;
    }
    
    public List<String> getPodCidrs() {
        return this.podCidrs;
    }

    public void setPodCidrs(List<String> podCidrs) {
      this.podCidrs = podCidrs;
    }
    
    public String getProviderId() {
        return this.providerId;
    }

    public void setProviderId(String providerId) {
      this.providerId = providerId;
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
    
    public Map<String, Object> getRequested() {
        return this.requested;
    }

    public void setRequested(Map<String, Object> requested) {
      this.requested = requested;
    }
    
    public String getRequestedHostname() {
        return this.requestedHostname;
    }

    public void setRequestedHostname(String requestedHostname) {
      this.requestedHostname = requestedHostname;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public List<Taint> getTaints() {
        return this.taints;
    }

    public void setTaints(List<Taint> taints) {
      this.taints = taints;
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
    
    public Boolean getUnschedulable() {
        return this.unschedulable;
    }

    public void setUnschedulable(Boolean unschedulable) {
      this.unschedulable = unschedulable;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Vmwarevsphereconfig getVmwarevsphereConfig() {
        return this.vmwarevsphereConfig;
    }

    public void setVmwarevsphereConfig(Vmwarevsphereconfig vmwarevsphereConfig) {
      this.vmwarevsphereConfig = vmwarevsphereConfig;
    }
    
    public Map<String, Object> getVolumesAttached() {
        return this.volumesAttached;
    }

    public void setVolumesAttached(Map<String, Object> volumesAttached) {
      this.volumesAttached = volumesAttached;
    }
    
    public List<String> getVolumesInUse() {
        return this.volumesInUse;
    }

    public void setVolumesInUse(List<String> volumesInUse) {
      this.volumesInUse = volumesInUse;
    }
    
    public Boolean getWorker() {
        return this.worker;
    }

    public void setWorker(Boolean worker) {
      this.worker = worker;
    }
    
}
