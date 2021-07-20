package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class GoogleKubernetesEngineConfig extends AbstractType {
    
    @JsonProperty("clusterIpv4Cidr")
    private String clusterIpv4cidr;
    
    @JsonProperty("credential")
    private String credential;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("diskSizeGb")
    private Integer diskSizeGb;
    
    @JsonProperty("diskType")
    private String diskType;
    
    @JsonProperty("displayName")
    private String displayName;
    
    @JsonProperty("driverName")
    private String driverName;
    
    @JsonProperty("enableAlphaFeature")
    private Boolean enableAlphaFeature;
    
    @JsonProperty("enableAutoRepair")
    private Boolean enableAutoRepair;
    
    @JsonProperty("enableAutoUpgrade")
    private Boolean enableAutoUpgrade;
    
    @JsonProperty("enableHorizontalPodAutoscaling")
    private Boolean enableHorizontalPodAutoscaling;
    
    @JsonProperty("enableHttpLoadBalancing")
    private Boolean enableHttpLoadBalancing;
    
    @JsonProperty("enableKubernetesDashboard")
    private Boolean enableKubernetesDashboard;
    
    @JsonProperty("enableLegacyAbac")
    private Boolean enableLegacyAbac;
    
    @JsonProperty("enableMasterAuthorizedNetwork")
    private Boolean enableMasterAuthorizedNetwork;
    
    @JsonProperty("enableNetworkPolicyConfig")
    private Boolean enableNetworkPolicyConfig;
    
    @JsonProperty("enableNodepoolAutoscaling")
    private Boolean enableNodepoolAutoscaling;
    
    @JsonProperty("enablePrivateEndpoint")
    private Boolean enablePrivateEndpoint;
    
    @JsonProperty("enablePrivateNodes")
    private Boolean enablePrivateNodes;
    
    @JsonProperty("enableStackdriverLogging")
    private Boolean enableStackdriverLogging;
    
    @JsonProperty("enableStackdriverMonitoring")
    private Boolean enableStackdriverMonitoring;
    
    @JsonProperty("imageType")
    private String imageType;
    
    @JsonProperty("ipPolicyClusterIpv4CidrBlock")
    private String ipPolicyClusterIpv4cidrBlock;
    
    @JsonProperty("ipPolicyClusterSecondaryRangeName")
    private String ipPolicyClusterSecondaryRangeName;
    
    @JsonProperty("ipPolicyCreateSubnetwork")
    private Boolean ipPolicyCreateSubnetwork;
    
    @JsonProperty("ipPolicyNodeIpv4CidrBlock")
    private String ipPolicyNodeIpv4cidrBlock;
    
    @JsonProperty("ipPolicyServicesIpv4CidrBlock")
    private String ipPolicyServicesIpv4cidrBlock;
    
    @JsonProperty("ipPolicyServicesSecondaryRangeName")
    private String ipPolicyServicesSecondaryRangeName;
    
    @JsonProperty("ipPolicySubnetworkName")
    private String ipPolicySubnetworkName;
    
    @JsonProperty("issueClientCertificate")
    private Boolean issueClientCertificate;
    
    @JsonProperty("kubernetesDashboard")
    private Boolean kubernetesDashboard;
    
    @JsonProperty("labels")
    private List<String> labels;
    
    @JsonProperty("localSsdCount")
    private Integer localSsdCount;
    
    @JsonProperty("locations")
    private List<String> locations;
    
    @JsonProperty("machineType")
    private String machineType;
    
    @JsonProperty("maintenanceWindow")
    private String maintenanceWindow;
    
    @JsonProperty("masterAuthorizedNetworkCidrBlocks")
    private List<String> masterAuthorizedNetworkCidrBlocks;
    
    @JsonProperty("masterIpv4CidrBlock")
    private String masterIpv4cidrBlock;
    
    @JsonProperty("masterVersion")
    private String masterVersion;
    
    @JsonProperty("maxNodeCount")
    private Integer maxNodeCount;
    
    @JsonProperty("minNodeCount")
    private Integer minNodeCount;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("network")
    private String network;
    
    @JsonProperty("nodeCount")
    private Integer nodeCount;
    
    @JsonProperty("nodePool")
    private String nodePool;
    
    @JsonProperty("nodeVersion")
    private String nodeVersion;
    
    @JsonProperty("oauthScopes")
    private List<String> oauthScopes;
    
    @JsonProperty("preemptible")
    private Boolean preemptible;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("resourceLabels")
    private List<String> resourceLabels;
    
    @JsonProperty("serviceAccount")
    private String serviceAccount;
    
    @JsonProperty("subNetwork")
    private String subNetwork;
    
    @JsonProperty("taints")
    private List<String> taints;
    
    @JsonProperty("useIpAliases")
    private Boolean useIpAliases;
    
    @JsonProperty("zone")
    private String zone;
    
    public String getClusterIpv4cidr() {
        return this.clusterIpv4cidr;
    }

    public void setClusterIpv4cidr(String clusterIpv4cidr) {
      this.clusterIpv4cidr = clusterIpv4cidr;
    }
    
    public String getCredential() {
        return this.credential;
    }

    public void setCredential(String credential) {
      this.credential = credential;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }

    public void setDiskSizeGb(Integer diskSizeGb) {
      this.diskSizeGb = diskSizeGb;
    }
    
    public String getDiskType() {
        return this.diskType;
    }

    public void setDiskType(String diskType) {
      this.diskType = diskType;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
      this.driverName = driverName;
    }
    
    public Boolean getEnableAlphaFeature() {
        return this.enableAlphaFeature;
    }

    public void setEnableAlphaFeature(Boolean enableAlphaFeature) {
      this.enableAlphaFeature = enableAlphaFeature;
    }
    
    public Boolean getEnableAutoRepair() {
        return this.enableAutoRepair;
    }

    public void setEnableAutoRepair(Boolean enableAutoRepair) {
      this.enableAutoRepair = enableAutoRepair;
    }
    
    public Boolean getEnableAutoUpgrade() {
        return this.enableAutoUpgrade;
    }

    public void setEnableAutoUpgrade(Boolean enableAutoUpgrade) {
      this.enableAutoUpgrade = enableAutoUpgrade;
    }
    
    public Boolean getEnableHorizontalPodAutoscaling() {
        return this.enableHorizontalPodAutoscaling;
    }

    public void setEnableHorizontalPodAutoscaling(Boolean enableHorizontalPodAutoscaling) {
      this.enableHorizontalPodAutoscaling = enableHorizontalPodAutoscaling;
    }
    
    public Boolean getEnableHttpLoadBalancing() {
        return this.enableHttpLoadBalancing;
    }

    public void setEnableHttpLoadBalancing(Boolean enableHttpLoadBalancing) {
      this.enableHttpLoadBalancing = enableHttpLoadBalancing;
    }
    
    public Boolean getEnableKubernetesDashboard() {
        return this.enableKubernetesDashboard;
    }

    public void setEnableKubernetesDashboard(Boolean enableKubernetesDashboard) {
      this.enableKubernetesDashboard = enableKubernetesDashboard;
    }
    
    public Boolean getEnableLegacyAbac() {
        return this.enableLegacyAbac;
    }

    public void setEnableLegacyAbac(Boolean enableLegacyAbac) {
      this.enableLegacyAbac = enableLegacyAbac;
    }
    
    public Boolean getEnableMasterAuthorizedNetwork() {
        return this.enableMasterAuthorizedNetwork;
    }

    public void setEnableMasterAuthorizedNetwork(Boolean enableMasterAuthorizedNetwork) {
      this.enableMasterAuthorizedNetwork = enableMasterAuthorizedNetwork;
    }
    
    public Boolean getEnableNetworkPolicyConfig() {
        return this.enableNetworkPolicyConfig;
    }

    public void setEnableNetworkPolicyConfig(Boolean enableNetworkPolicyConfig) {
      this.enableNetworkPolicyConfig = enableNetworkPolicyConfig;
    }
    
    public Boolean getEnableNodepoolAutoscaling() {
        return this.enableNodepoolAutoscaling;
    }

    public void setEnableNodepoolAutoscaling(Boolean enableNodepoolAutoscaling) {
      this.enableNodepoolAutoscaling = enableNodepoolAutoscaling;
    }
    
    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    public void setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
      this.enablePrivateEndpoint = enablePrivateEndpoint;
    }
    
    public Boolean getEnablePrivateNodes() {
        return this.enablePrivateNodes;
    }

    public void setEnablePrivateNodes(Boolean enablePrivateNodes) {
      this.enablePrivateNodes = enablePrivateNodes;
    }
    
    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public void setEnableStackdriverLogging(Boolean enableStackdriverLogging) {
      this.enableStackdriverLogging = enableStackdriverLogging;
    }
    
    public Boolean getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring;
    }

    public void setEnableStackdriverMonitoring(Boolean enableStackdriverMonitoring) {
      this.enableStackdriverMonitoring = enableStackdriverMonitoring;
    }
    
    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String imageType) {
      this.imageType = imageType;
    }
    
    public String getIpPolicyClusterIpv4cidrBlock() {
        return this.ipPolicyClusterIpv4cidrBlock;
    }

    public void setIpPolicyClusterIpv4cidrBlock(String ipPolicyClusterIpv4cidrBlock) {
      this.ipPolicyClusterIpv4cidrBlock = ipPolicyClusterIpv4cidrBlock;
    }
    
    public String getIpPolicyClusterSecondaryRangeName() {
        return this.ipPolicyClusterSecondaryRangeName;
    }

    public void setIpPolicyClusterSecondaryRangeName(String ipPolicyClusterSecondaryRangeName) {
      this.ipPolicyClusterSecondaryRangeName = ipPolicyClusterSecondaryRangeName;
    }
    
    public Boolean getIpPolicyCreateSubnetwork() {
        return this.ipPolicyCreateSubnetwork;
    }

    public void setIpPolicyCreateSubnetwork(Boolean ipPolicyCreateSubnetwork) {
      this.ipPolicyCreateSubnetwork = ipPolicyCreateSubnetwork;
    }
    
    public String getIpPolicyNodeIpv4cidrBlock() {
        return this.ipPolicyNodeIpv4cidrBlock;
    }

    public void setIpPolicyNodeIpv4cidrBlock(String ipPolicyNodeIpv4cidrBlock) {
      this.ipPolicyNodeIpv4cidrBlock = ipPolicyNodeIpv4cidrBlock;
    }
    
    public String getIpPolicyServicesIpv4cidrBlock() {
        return this.ipPolicyServicesIpv4cidrBlock;
    }

    public void setIpPolicyServicesIpv4cidrBlock(String ipPolicyServicesIpv4cidrBlock) {
      this.ipPolicyServicesIpv4cidrBlock = ipPolicyServicesIpv4cidrBlock;
    }
    
    public String getIpPolicyServicesSecondaryRangeName() {
        return this.ipPolicyServicesSecondaryRangeName;
    }

    public void setIpPolicyServicesSecondaryRangeName(String ipPolicyServicesSecondaryRangeName) {
      this.ipPolicyServicesSecondaryRangeName = ipPolicyServicesSecondaryRangeName;
    }
    
    public String getIpPolicySubnetworkName() {
        return this.ipPolicySubnetworkName;
    }

    public void setIpPolicySubnetworkName(String ipPolicySubnetworkName) {
      this.ipPolicySubnetworkName = ipPolicySubnetworkName;
    }
    
    public Boolean getIssueClientCertificate() {
        return this.issueClientCertificate;
    }

    public void setIssueClientCertificate(Boolean issueClientCertificate) {
      this.issueClientCertificate = issueClientCertificate;
    }
    
    public Boolean getKubernetesDashboard() {
        return this.kubernetesDashboard;
    }

    public void setKubernetesDashboard(Boolean kubernetesDashboard) {
      this.kubernetesDashboard = kubernetesDashboard;
    }
    
    public List<String> getLabels() {
        return this.labels;
    }

    public void setLabels(List<String> labels) {
      this.labels = labels;
    }
    
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    public void setLocalSsdCount(Integer localSsdCount) {
      this.localSsdCount = localSsdCount;
    }
    
    public List<String> getLocations() {
        return this.locations;
    }

    public void setLocations(List<String> locations) {
      this.locations = locations;
    }
    
    public String getMachineType() {
        return this.machineType;
    }

    public void setMachineType(String machineType) {
      this.machineType = machineType;
    }
    
    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
      this.maintenanceWindow = maintenanceWindow;
    }
    
    public List<String> getMasterAuthorizedNetworkCidrBlocks() {
        return this.masterAuthorizedNetworkCidrBlocks;
    }

    public void setMasterAuthorizedNetworkCidrBlocks(List<String> masterAuthorizedNetworkCidrBlocks) {
      this.masterAuthorizedNetworkCidrBlocks = masterAuthorizedNetworkCidrBlocks;
    }
    
    public String getMasterIpv4cidrBlock() {
        return this.masterIpv4cidrBlock;
    }

    public void setMasterIpv4cidrBlock(String masterIpv4cidrBlock) {
      this.masterIpv4cidrBlock = masterIpv4cidrBlock;
    }
    
    public String getMasterVersion() {
        return this.masterVersion;
    }

    public void setMasterVersion(String masterVersion) {
      this.masterVersion = masterVersion;
    }
    
    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }

    public void setMaxNodeCount(Integer maxNodeCount) {
      this.maxNodeCount = maxNodeCount;
    }
    
    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    public void setMinNodeCount(Integer minNodeCount) {
      this.minNodeCount = minNodeCount;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
      this.network = network;
    }
    
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
      this.nodeCount = nodeCount;
    }
    
    public String getNodePool() {
        return this.nodePool;
    }

    public void setNodePool(String nodePool) {
      this.nodePool = nodePool;
    }
    
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public void setNodeVersion(String nodeVersion) {
      this.nodeVersion = nodeVersion;
    }
    
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }

    public void setOauthScopes(List<String> oauthScopes) {
      this.oauthScopes = oauthScopes;
    }
    
    public Boolean getPreemptible() {
        return this.preemptible;
    }

    public void setPreemptible(Boolean preemptible) {
      this.preemptible = preemptible;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public List<String> getResourceLabels() {
        return this.resourceLabels;
    }

    public void setResourceLabels(List<String> resourceLabels) {
      this.resourceLabels = resourceLabels;
    }
    
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
      this.serviceAccount = serviceAccount;
    }
    
    public String getSubNetwork() {
        return this.subNetwork;
    }

    public void setSubNetwork(String subNetwork) {
      this.subNetwork = subNetwork;
    }
    
    public List<String> getTaints() {
        return this.taints;
    }

    public void setTaints(List<String> taints) {
      this.taints = taints;
    }
    
    public Boolean getUseIpAliases() {
        return this.useIpAliases;
    }

    public void setUseIpAliases(Boolean useIpAliases) {
      this.useIpAliases = useIpAliases;
    }
    
    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
      this.zone = zone;
    }
    
}
