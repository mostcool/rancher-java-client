package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

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
    
    public String getAadClientCertPassword() {
        return this.aadClientCertPassword;
    }

    public void setAadClientCertPassword(String aadClientCertPassword) {
      this.aadClientCertPassword = aadClientCertPassword;
    }
    
    public String getAadClientCertPath() {
        return this.aadClientCertPath;
    }

    public void setAadClientCertPath(String aadClientCertPath) {
      this.aadClientCertPath = aadClientCertPath;
    }
    
    public String getAadClientId() {
        return this.aadClientId;
    }

    public void setAadClientId(String aadClientId) {
      this.aadClientId = aadClientId;
    }
    
    public String getAadClientSecret() {
        return this.aadClientSecret;
    }

    public void setAadClientSecret(String aadClientSecret) {
      this.aadClientSecret = aadClientSecret;
    }
    
    public String getCloud() {
        return this.cloud;
    }

    public void setCloud(String cloud) {
      this.cloud = cloud;
    }
    
    public Boolean getCloudProviderBackoff() {
        return this.cloudProviderBackoff;
    }

    public void setCloudProviderBackoff(Boolean cloudProviderBackoff) {
      this.cloudProviderBackoff = cloudProviderBackoff;
    }
    
    public Integer getCloudProviderBackoffDuration() {
        return this.cloudProviderBackoffDuration;
    }

    public void setCloudProviderBackoffDuration(Integer cloudProviderBackoffDuration) {
      this.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
    }
    
    public Integer getCloudProviderBackoffExponent() {
        return this.cloudProviderBackoffExponent;
    }

    public void setCloudProviderBackoffExponent(Integer cloudProviderBackoffExponent) {
      this.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
    }
    
    public Integer getCloudProviderBackoffJitter() {
        return this.cloudProviderBackoffJitter;
    }

    public void setCloudProviderBackoffJitter(Integer cloudProviderBackoffJitter) {
      this.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
    }
    
    public Integer getCloudProviderBackoffRetries() {
        return this.cloudProviderBackoffRetries;
    }

    public void setCloudProviderBackoffRetries(Integer cloudProviderBackoffRetries) {
      this.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
    }
    
    public Boolean getCloudProviderRateLimit() {
        return this.cloudProviderRateLimit;
    }

    public void setCloudProviderRateLimit(Boolean cloudProviderRateLimit) {
      this.cloudProviderRateLimit = cloudProviderRateLimit;
    }
    
    public Integer getCloudProviderRateLimitBucket() {
        return this.cloudProviderRateLimitBucket;
    }

    public void setCloudProviderRateLimitBucket(Integer cloudProviderRateLimitBucket) {
      this.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
    }
    
    public Integer getCloudProviderRateLimitQps() {
        return this.cloudProviderRateLimitQps;
    }

    public void setCloudProviderRateLimitQps(Integer cloudProviderRateLimitQps) {
      this.cloudProviderRateLimitQps = cloudProviderRateLimitQps;
    }
    
    public Boolean getExcludeMasterFromStandardLb() {
        return this.excludeMasterFromStandardLb;
    }

    public void setExcludeMasterFromStandardLb(Boolean excludeMasterFromStandardLb) {
      this.excludeMasterFromStandardLb = excludeMasterFromStandardLb;
    }
    
    public String getLoadBalancerSku() {
        return this.loadBalancerSku;
    }

    public void setLoadBalancerSku(String loadBalancerSku) {
      this.loadBalancerSku = loadBalancerSku;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
      this.location = location;
    }
    
    public Integer getMaximumLoadBalancerRuleCount() {
        return this.maximumLoadBalancerRuleCount;
    }

    public void setMaximumLoadBalancerRuleCount(Integer maximumLoadBalancerRuleCount) {
      this.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
    }
    
    public String getPrimaryAvailabilitySetName() {
        return this.primaryAvailabilitySetName;
    }

    public void setPrimaryAvailabilitySetName(String primaryAvailabilitySetName) {
      this.primaryAvailabilitySetName = primaryAvailabilitySetName;
    }
    
    public String getPrimaryScaleSetName() {
        return this.primaryScaleSetName;
    }

    public void setPrimaryScaleSetName(String primaryScaleSetName) {
      this.primaryScaleSetName = primaryScaleSetName;
    }
    
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
    }
    
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public void setRouteTableName(String routeTableName) {
      this.routeTableName = routeTableName;
    }
    
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
      this.securityGroupName = securityGroupName;
    }
    
    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
      this.subnetName = subnetName;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public Boolean getUseInstanceMetadata() {
        return this.useInstanceMetadata;
    }

    public void setUseInstanceMetadata(Boolean useInstanceMetadata) {
      this.useInstanceMetadata = useInstanceMetadata;
    }
    
    public Boolean getUseManagedIdentityExtension() {
        return this.useManagedIdentityExtension;
    }

    public void setUseManagedIdentityExtension(Boolean useManagedIdentityExtension) {
      this.useManagedIdentityExtension = useManagedIdentityExtension;
    }
    
    public String getUserAssignedIdentityId() {
        return this.userAssignedIdentityId;
    }

    public void setUserAssignedIdentityId(String userAssignedIdentityId) {
      this.userAssignedIdentityId = userAssignedIdentityId;
    }
    
    public String getVmType() {
        return this.vmType;
    }

    public void setVmType(String vmType) {
      this.vmType = vmType;
    }
    
    public String getVnetName() {
        return this.vnetName;
    }

    public void setVnetName(String vnetName) {
      this.vnetName = vnetName;
    }
    
    public String getVnetResourceGroup() {
        return this.vnetResourceGroup;
    }

    public void setVnetResourceGroup(String vnetResourceGroup) {
      this.vnetResourceGroup = vnetResourceGroup;
    }
    
}
