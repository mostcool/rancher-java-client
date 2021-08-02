package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
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
}
