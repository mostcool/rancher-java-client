package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Azureconfig extends AbstractType {
    
    @JsonProperty("availabilitySet")
    private String availabilitySet;
    
    @JsonProperty("clientId")
    private String clientId;
    
    @JsonProperty("clientSecret")
    private String clientSecret;
    
    @JsonProperty("customData")
    private String customData;
    
    @JsonProperty("diskSize")
    private String diskSize;
    
    @JsonProperty("dns")
    private String dns;
    
    @JsonProperty("dockerPort")
    private String dockerPort;
    
    @JsonProperty("environment")
    private String environment;
    
    @JsonProperty("faultDomainCount")
    private String faultDomainCount;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("location")
    private String location;
    
    @JsonProperty("managedDisks")
    private Boolean managedDisks;
    
    @JsonProperty("noPublicIp")
    private Boolean noPublicIp;
    
    @JsonProperty("nsg")
    private String nsg;
    
    @JsonProperty("openPort")
    private List<String> openPort;
    
    @JsonProperty("privateIpAddress")
    private String privateIpAddress;
    
    @JsonProperty("resourceGroup")
    private String resourceGroup;
    
    @JsonProperty("size")
    private String size;
    
    @JsonProperty("sshUser")
    private String sshUser;
    
    @JsonProperty("staticPublicIp")
    private Boolean staticPublicIp;
    
    @JsonProperty("storageType")
    private String storageType;
    
    @JsonProperty("subnet")
    private String subnet;
    
    @JsonProperty("subnetPrefix")
    private String subnetPrefix;
    
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    
    @JsonProperty("updateDomainCount")
    private String updateDomainCount;
    
    @JsonProperty("usePrivateIp")
    private Boolean usePrivateIp;
    
    @JsonProperty("vnet")
    private String vnet;
    
    public String getAvailabilitySet() {
        return this.availabilitySet;
    }

    public void setAvailabilitySet(String availabilitySet) {
      this.availabilitySet = availabilitySet;
    }
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
    }
    
    public String getCustomData() {
        return this.customData;
    }

    public void setCustomData(String customData) {
      this.customData = customData;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getDns() {
        return this.dns;
    }

    public void setDns(String dns) {
      this.dns = dns;
    }
    
    public String getDockerPort() {
        return this.dockerPort;
    }

    public void setDockerPort(String dockerPort) {
      this.dockerPort = dockerPort;
    }
    
    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
      this.environment = environment;
    }
    
    public String getFaultDomainCount() {
        return this.faultDomainCount;
    }

    public void setFaultDomainCount(String faultDomainCount) {
      this.faultDomainCount = faultDomainCount;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
      this.location = location;
    }
    
    public Boolean getManagedDisks() {
        return this.managedDisks;
    }

    public void setManagedDisks(Boolean managedDisks) {
      this.managedDisks = managedDisks;
    }
    
    public Boolean getNoPublicIp() {
        return this.noPublicIp;
    }

    public void setNoPublicIp(Boolean noPublicIp) {
      this.noPublicIp = noPublicIp;
    }
    
    public String getNsg() {
        return this.nsg;
    }

    public void setNsg(String nsg) {
      this.nsg = nsg;
    }
    
    public List<String> getOpenPort() {
        return this.openPort;
    }

    public void setOpenPort(List<String> openPort) {
      this.openPort = openPort;
    }
    
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
      this.privateIpAddress = privateIpAddress;
    }
    
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
    }
    
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
      this.size = size;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public Boolean getStaticPublicIp() {
        return this.staticPublicIp;
    }

    public void setStaticPublicIp(Boolean staticPublicIp) {
      this.staticPublicIp = staticPublicIp;
    }
    
    public String getStorageType() {
        return this.storageType;
    }

    public void setStorageType(String storageType) {
      this.storageType = storageType;
    }
    
    public String getSubnet() {
        return this.subnet;
    }

    public void setSubnet(String subnet) {
      this.subnet = subnet;
    }
    
    public String getSubnetPrefix() {
        return this.subnetPrefix;
    }

    public void setSubnetPrefix(String subnetPrefix) {
      this.subnetPrefix = subnetPrefix;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public String getUpdateDomainCount() {
        return this.updateDomainCount;
    }

    public void setUpdateDomainCount(String updateDomainCount) {
      this.updateDomainCount = updateDomainCount;
    }
    
    public Boolean getUsePrivateIp() {
        return this.usePrivateIp;
    }

    public void setUsePrivateIp(Boolean usePrivateIp) {
      this.usePrivateIp = usePrivateIp;
    }
    
    public String getVnet() {
        return this.vnet;
    }

    public void setVnet(String vnet) {
      this.vnet = vnet;
    }
    
}
