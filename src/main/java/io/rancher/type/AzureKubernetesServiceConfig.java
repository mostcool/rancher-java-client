package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class AzureKubernetesServiceConfig extends AbstractType {

    @JsonProperty("aadClientAppId")
    private String aadClientAppId;

    @JsonProperty("aadServerAppId")
    private String aadServerAppId;

    @JsonProperty("aadServerAppSecret")
    private String aadServerAppSecret;

    @JsonProperty("aadTenantId")
    private String aadTenantId;

    @JsonProperty("adminUsername")
    private String adminUsername;

    @JsonProperty("agentOsdiskSize")
    private Integer agentOsdiskSize;

    @JsonProperty("agentPoolName")
    private String agentPoolName;

    @JsonProperty("agentStorageProfile")
    private String agentStorageProfile;

    @JsonProperty("agentVmSize")
    private String agentVmSize;

    @JsonProperty("authBaseUrl")
    private String authBaseUrl;

    @JsonProperty("baseUrl")
    private String baseUrl;

    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("clientSecret")
    private String clientSecret;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("dnsServiceIp")
    private String dnsServiceIp;

    @JsonProperty("dockerBridgeCidr")
    private String dockerBridgeCidr;

    @JsonProperty("driverName")
    private String driverName;

    @JsonProperty("enableHttpApplicationRouting")
    private Boolean enableHttpApplicationRouting;

    @JsonProperty("enableMonitoring")
    private Boolean enableMonitoring;

    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;

    @JsonProperty("location")
    private String location;

    @JsonProperty("logAnalyticsWorkspace")
    private String logAnalyticsWorkspace;

    @JsonProperty("logAnalyticsWorkspaceResourceGroup")
    private String logAnalyticsWorkspaceResourceGroup;

    @JsonProperty("masterDnsPrefix")
    private String masterDnsPrefix;

    @JsonProperty("maxPods")
    private Integer maxPods;

    @JsonProperty("name")
    private String name;

    @JsonProperty("networkPlugin")
    private String networkPlugin;

    @JsonProperty("networkPolicy")
    private String networkPolicy;

    @JsonProperty("podCidr")
    private String podCidr;

    @JsonProperty("resourceGroup")
    private String resourceGroup;

    @JsonProperty("serviceCidr")
    private String serviceCidr;

    @JsonProperty("sshPublicKeyContents")
    private String sshPublicKeyContents;

    @JsonProperty("subnet")
    private String subnet;

    @JsonProperty("subscriptionId")
    private String subscriptionId;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("tenantId")
    private String tenantId;

    @JsonProperty("virtualNetwork")
    private String virtualNetwork;

    @JsonProperty("virtualNetworkResourceGroup")
    private String virtualNetworkResourceGroup;
}
