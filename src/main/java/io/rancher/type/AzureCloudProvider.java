package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AzureCloudProvider extends AbstractType {

    @JsonProperty("aadClientCertPassword")
    private String aadClientCertPassword;

    @JsonProperty("aadClientCertPath")
    private String aadClientCertPath;

    @JsonProperty("aadClientId")
    private String aadClientId;

    @JsonProperty("aadClientSecret")
    private String aadClientSecret;

    @JsonProperty("cloud")
    private String cloud;

    @JsonProperty("cloudProviderBackoff")
    private Boolean cloudProviderBackoff;

    @JsonProperty("cloudProviderBackoffDuration")
    private Integer cloudProviderBackoffDuration;

    @JsonProperty("cloudProviderBackoffExponent")
    private Integer cloudProviderBackoffExponent;

    @JsonProperty("cloudProviderBackoffJitter")
    private Integer cloudProviderBackoffJitter;

    @JsonProperty("cloudProviderBackoffRetries")
    private Integer cloudProviderBackoffRetries;

    @JsonProperty("cloudProviderRateLimit")
    private Boolean cloudProviderRateLimit;

    @JsonProperty("cloudProviderRateLimitBucket")
    private Integer cloudProviderRateLimitBucket;

    @JsonProperty("cloudProviderRateLimitQPS")
    private Integer cloudProviderRateLimitQps;

    @JsonProperty("excludeMasterFromStandardLB")
    private Boolean excludeMasterFromStandardLb;

    @JsonProperty("loadBalancerSku")
    private String loadBalancerSku;

    @JsonProperty("location")
    private String location;

    @JsonProperty("maximumLoadBalancerRuleCount")
    private Integer maximumLoadBalancerRuleCount;

    @JsonProperty("primaryAvailabilitySetName")
    private String primaryAvailabilitySetName;

    @JsonProperty("primaryScaleSetName")
    private String primaryScaleSetName;

    @JsonProperty("resourceGroup")
    private String resourceGroup;

    @JsonProperty("routeTableName")
    private String routeTableName;

    @JsonProperty("securityGroupName")
    private String securityGroupName;

    @JsonProperty("subnetName")
    private String subnetName;

    @JsonProperty("subscriptionId")
    private String subscriptionId;

    @JsonProperty("tenantId")
    private String tenantId;

    @JsonProperty("useInstanceMetadata")
    private Boolean useInstanceMetadata;

    @JsonProperty("useManagedIdentityExtension")
    private Boolean useManagedIdentityExtension;

    @JsonProperty("userAssignedIdentityID")
    private String userAssignedIdentityId;

    @JsonProperty("vmType")
    private String vmType;

    @JsonProperty("vnetName")
    private String vnetName;

    @JsonProperty("vnetResourceGroup")
    private String vnetResourceGroup;
}
