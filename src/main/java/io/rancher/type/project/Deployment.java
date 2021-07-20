package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Deployment extends AbstractType {
    
    @JsonProperty("activeDeadlineSeconds")
    private Integer activeDeadlineSeconds;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("automountServiceAccountToken")
    private Boolean automountServiceAccountToken;
    
    @JsonProperty("containers")
    private List<Container> containers;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("deploymentConfig")
    private DeploymentConfig deploymentConfig;
    
    @JsonProperty("deploymentStatus")
    private DeploymentStatus deploymentStatus;
    
    @JsonProperty("dnsConfig")
    private PodDNSConfig dnsConfig;
    
    @JsonProperty("dnsPolicy")
    private String dnsPolicy;
    
    @JsonProperty("enableServiceLinks")
    private Boolean enableServiceLinks;
    
    @JsonProperty("ephemeralContainers")
    private List<EphemeralContainer> ephemeralContainers;
    
    @JsonProperty("fsGroupChangePolicy")
    private String fsGroupChangePolicy;
    
    @JsonProperty("fsgid")
    private Integer fsgid;
    
    @JsonProperty("gids")
    private List<Integer> gids;
    
    @JsonProperty("hostAliases")
    private List<HostAlias> hostAliases;
    
    @JsonProperty("hostIPC")
    private Boolean hostIpc;
    
    @JsonProperty("hostNetwork")
    private Boolean hostNetwork;
    
    @JsonProperty("hostPID")
    private Boolean hostPid;
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("imagePullSecrets")
    private List<LocalObjectReference> imagePullSecrets;
    
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
    
    @JsonProperty("nodeId")
    private String nodeId;
    
    @JsonProperty("overhead")
    private Map<String, Object> overhead;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("paused")
    private Boolean paused;
    
    @JsonProperty("preemptionPolicy")
    private String preemptionPolicy;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;
    
    @JsonProperty("readinessGates")
    private List<PodReadinessGate> readinessGates;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("restartPolicy")
    private String restartPolicy;
    
    @JsonProperty("runAsGroup")
    private Integer runAsGroup;
    
    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;
    
    @JsonProperty("runtimeClassName")
    private String runtimeClassName;
    
    @JsonProperty("scale")
    private Integer scale;
    
    @JsonProperty("scheduling")
    private Scheduling scheduling;
    
    @JsonProperty("selector")
    private LabelSelector selector;
    
    @JsonProperty("serviceAccountName")
    private String serviceAccountName;
    
    @JsonProperty("shareProcessNamespace")
    private Boolean shareProcessNamespace;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("subdomain")
    private String subdomain;
    
    @JsonProperty("sysctls")
    private List<Sysctl> sysctls;
    
    @JsonProperty("terminationGracePeriodSeconds")
    private Integer terminationGracePeriodSeconds;
    
    @JsonProperty("topologySpreadConstraints")
    private List<TopologySpreadConstraint> topologySpreadConstraints;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uid")
    private Integer uid;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("volumes")
    private List<Volume> volumes;
    
    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;
    
    @JsonProperty("workloadAnnotations")
    private Map<String, Object> workloadAnnotations;
    
    @JsonProperty("workloadLabels")
    private Map<String, Object> workloadLabels;
    
    @JsonProperty("workloadMetrics")
    private List<WorkloadMetric> workloadMetrics;
    
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
      this.activeDeadlineSeconds = activeDeadlineSeconds;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Boolean getAutomountServiceAccountToken() {
        return this.automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
      this.automountServiceAccountToken = automountServiceAccountToken;
    }
    
    public List<Container> getContainers() {
        return this.containers;
    }

    public void setContainers(List<Container> containers) {
      this.containers = containers;
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
    
    public DeploymentConfig getDeploymentConfig() {
        return this.deploymentConfig;
    }

    public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
      this.deploymentConfig = deploymentConfig;
    }
    
    public DeploymentStatus getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public void setDeploymentStatus(DeploymentStatus deploymentStatus) {
      this.deploymentStatus = deploymentStatus;
    }
    
    public PodDNSConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public void setDnsConfig(PodDNSConfig dnsConfig) {
      this.dnsConfig = dnsConfig;
    }
    
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
      this.dnsPolicy = dnsPolicy;
    }
    
    public Boolean getEnableServiceLinks() {
        return this.enableServiceLinks;
    }

    public void setEnableServiceLinks(Boolean enableServiceLinks) {
      this.enableServiceLinks = enableServiceLinks;
    }
    
    public List<EphemeralContainer> getEphemeralContainers() {
        return this.ephemeralContainers;
    }

    public void setEphemeralContainers(List<EphemeralContainer> ephemeralContainers) {
      this.ephemeralContainers = ephemeralContainers;
    }
    
    public String getFsGroupChangePolicy() {
        return this.fsGroupChangePolicy;
    }

    public void setFsGroupChangePolicy(String fsGroupChangePolicy) {
      this.fsGroupChangePolicy = fsGroupChangePolicy;
    }
    
    public Integer getFsgid() {
        return this.fsgid;
    }

    public void setFsgid(Integer fsgid) {
      this.fsgid = fsgid;
    }
    
    public List<Integer> getGids() {
        return this.gids;
    }

    public void setGids(List<Integer> gids) {
      this.gids = gids;
    }
    
    public List<HostAlias> getHostAliases() {
        return this.hostAliases;
    }

    public void setHostAliases(List<HostAlias> hostAliases) {
      this.hostAliases = hostAliases;
    }
    
    public Boolean getHostIpc() {
        return this.hostIpc;
    }

    public void setHostIpc(Boolean hostIpc) {
      this.hostIpc = hostIpc;
    }
    
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
      this.hostNetwork = hostNetwork;
    }
    
    public Boolean getHostPid() {
        return this.hostPid;
    }

    public void setHostPid(Boolean hostPid) {
      this.hostPid = hostPid;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public List<LocalObjectReference> getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
      this.imagePullSecrets = imagePullSecrets;
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
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public Map<String, Object> getOverhead() {
        return this.overhead;
    }

    public void setOverhead(Map<String, Object> overhead) {
      this.overhead = overhead;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Boolean getPaused() {
        return this.paused;
    }

    public void setPaused(Boolean paused) {
      this.paused = paused;
    }
    
    public String getPreemptionPolicy() {
        return this.preemptionPolicy;
    }

    public void setPreemptionPolicy(String preemptionPolicy) {
      this.preemptionPolicy = preemptionPolicy;
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
    
    public List<PodReadinessGate> getReadinessGates() {
        return this.readinessGates;
    }

    public void setReadinessGates(List<PodReadinessGate> readinessGates) {
      this.readinessGates = readinessGates;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
      this.restartPolicy = restartPolicy;
    }
    
    public Integer getRunAsGroup() {
        return this.runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
      this.runAsGroup = runAsGroup;
    }
    
    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
      this.runAsNonRoot = runAsNonRoot;
    }
    
    public String getRuntimeClassName() {
        return this.runtimeClassName;
    }

    public void setRuntimeClassName(String runtimeClassName) {
      this.runtimeClassName = runtimeClassName;
    }
    
    public Integer getScale() {
        return this.scale;
    }

    public void setScale(Integer scale) {
      this.scale = scale;
    }
    
    public Scheduling getScheduling() {
        return this.scheduling;
    }

    public void setScheduling(Scheduling scheduling) {
      this.scheduling = scheduling;
    }
    
    public LabelSelector getSelector() {
        return this.selector;
    }

    public void setSelector(LabelSelector selector) {
      this.selector = selector;
    }
    
    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
      this.serviceAccountName = serviceAccountName;
    }
    
    public Boolean getShareProcessNamespace() {
        return this.shareProcessNamespace;
    }

    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
      this.shareProcessNamespace = shareProcessNamespace;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getSubdomain() {
        return this.subdomain;
    }

    public void setSubdomain(String subdomain) {
      this.subdomain = subdomain;
    }
    
    public List<Sysctl> getSysctls() {
        return this.sysctls;
    }

    public void setSysctls(List<Sysctl> sysctls) {
      this.sysctls = sysctls;
    }
    
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
      this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }
    
    public List<TopologySpreadConstraint> getTopologySpreadConstraints() {
        return this.topologySpreadConstraints;
    }

    public void setTopologySpreadConstraints(List<TopologySpreadConstraint> topologySpreadConstraints) {
      this.topologySpreadConstraints = topologySpreadConstraints;
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
    
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
      this.uid = uid;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public List<Volume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<Volume> volumes) {
      this.volumes = volumes;
    }
    
    public WindowsSecurityContextOptions getWindowsOptions() {
        return this.windowsOptions;
    }

    public void setWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
      this.windowsOptions = windowsOptions;
    }
    
    public Map<String, Object> getWorkloadAnnotations() {
        return this.workloadAnnotations;
    }

    public void setWorkloadAnnotations(Map<String, Object> workloadAnnotations) {
      this.workloadAnnotations = workloadAnnotations;
    }
    
    public Map<String, Object> getWorkloadLabels() {
        return this.workloadLabels;
    }

    public void setWorkloadLabels(Map<String, Object> workloadLabels) {
      this.workloadLabels = workloadLabels;
    }
    
    public List<WorkloadMetric> getWorkloadMetrics() {
        return this.workloadMetrics;
    }

    public void setWorkloadMetrics(List<WorkloadMetric> workloadMetrics) {
      this.workloadMetrics = workloadMetrics;
    }
    
}
