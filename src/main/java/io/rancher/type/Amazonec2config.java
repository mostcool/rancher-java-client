package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Amazonec2config extends AbstractType {
    
    @JsonProperty("accessKey")
    private String accessKey;
    
    @JsonProperty("ami")
    private String ami;
    
    @JsonProperty("blockDurationMinutes")
    private String blockDurationMinutes;
    
    @JsonProperty("deviceName")
    private String deviceName;
    
    @JsonProperty("encryptEbsVolume")
    private Boolean encryptEbsVolume;
    
    @JsonProperty("endpoint")
    private String endpoint;
    
    @JsonProperty("httpEndpoint")
    private String httpEndpoint;
    
    @JsonProperty("httpTokens")
    private String httpTokens;
    
    @JsonProperty("iamInstanceProfile")
    private String iamInstanceProfile;
    
    @JsonProperty("insecureTransport")
    private Boolean insecureTransport;
    
    @JsonProperty("instanceType")
    private String instanceType;
    
    @JsonProperty("keypairName")
    private String keypairName;
    
    @JsonProperty("kmsKey")
    private String kmsKey;
    
    @JsonProperty("monitoring")
    private Boolean monitoring;
    
    @JsonProperty("openPort")
    private List<String> openPort;
    
    @JsonProperty("privateAddressOnly")
    private Boolean privateAddressOnly;
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("requestSpotInstance")
    private Boolean requestSpotInstance;
    
    @JsonProperty("retries")
    private String retries;
    
    @JsonProperty("rootSize")
    private String rootSize;
    
    @JsonProperty("secretKey")
    private String secretKey;
    
    @JsonProperty("securityGroup")
    private List<String> securityGroup;
    
    @JsonProperty("securityGroupReadonly")
    private Boolean securityGroupReadonly;
    
    @JsonProperty("sessionToken")
    private String sessionToken;
    
    @JsonProperty("spotPrice")
    private String spotPrice;
    
    @JsonProperty("sshKeyContents")
    private String sshKeyContents;
    
    @JsonProperty("sshUser")
    private String sshUser;
    
    @JsonProperty("subnetId")
    private String subnetId;
    
    @JsonProperty("tags")
    private String tags;
    
    @JsonProperty("useEbsOptimizedInstance")
    private Boolean useEbsOptimizedInstance;
    
    @JsonProperty("usePrivateAddress")
    private Boolean usePrivateAddress;
    
    @JsonProperty("userdata")
    private String userdata;
    
    @JsonProperty("volumeType")
    private String volumeType;
    
    @JsonProperty("vpcId")
    private String vpcId;
    
    @JsonProperty("zone")
    private String zone;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getAmi() {
        return this.ami;
    }

    public void setAmi(String ami) {
      this.ami = ami;
    }
    
    public String getBlockDurationMinutes() {
        return this.blockDurationMinutes;
    }

    public void setBlockDurationMinutes(String blockDurationMinutes) {
      this.blockDurationMinutes = blockDurationMinutes;
    }
    
    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
      this.deviceName = deviceName;
    }
    
    public Boolean getEncryptEbsVolume() {
        return this.encryptEbsVolume;
    }

    public void setEncryptEbsVolume(Boolean encryptEbsVolume) {
      this.encryptEbsVolume = encryptEbsVolume;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public void setHttpEndpoint(String httpEndpoint) {
      this.httpEndpoint = httpEndpoint;
    }
    
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public void setHttpTokens(String httpTokens) {
      this.httpTokens = httpTokens;
    }
    
    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    public void setIamInstanceProfile(String iamInstanceProfile) {
      this.iamInstanceProfile = iamInstanceProfile;
    }
    
    public Boolean getInsecureTransport() {
        return this.insecureTransport;
    }

    public void setInsecureTransport(Boolean insecureTransport) {
      this.insecureTransport = insecureTransport;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public String getKeypairName() {
        return this.keypairName;
    }

    public void setKeypairName(String keypairName) {
      this.keypairName = keypairName;
    }
    
    public String getKmsKey() {
        return this.kmsKey;
    }

    public void setKmsKey(String kmsKey) {
      this.kmsKey = kmsKey;
    }
    
    public Boolean getMonitoring() {
        return this.monitoring;
    }

    public void setMonitoring(Boolean monitoring) {
      this.monitoring = monitoring;
    }
    
    public List<String> getOpenPort() {
        return this.openPort;
    }

    public void setOpenPort(List<String> openPort) {
      this.openPort = openPort;
    }
    
    public Boolean getPrivateAddressOnly() {
        return this.privateAddressOnly;
    }

    public void setPrivateAddressOnly(Boolean privateAddressOnly) {
      this.privateAddressOnly = privateAddressOnly;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public Boolean getRequestSpotInstance() {
        return this.requestSpotInstance;
    }

    public void setRequestSpotInstance(Boolean requestSpotInstance) {
      this.requestSpotInstance = requestSpotInstance;
    }
    
    public String getRetries() {
        return this.retries;
    }

    public void setRetries(String retries) {
      this.retries = retries;
    }
    
    public String getRootSize() {
        return this.rootSize;
    }

    public void setRootSize(String rootSize) {
      this.rootSize = rootSize;
    }
    
    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
    }
    
    public List<String> getSecurityGroup() {
        return this.securityGroup;
    }

    public void setSecurityGroup(List<String> securityGroup) {
      this.securityGroup = securityGroup;
    }
    
    public Boolean getSecurityGroupReadonly() {
        return this.securityGroupReadonly;
    }

    public void setSecurityGroupReadonly(Boolean securityGroupReadonly) {
      this.securityGroupReadonly = securityGroupReadonly;
    }
    
    public String getSessionToken() {
        return this.sessionToken;
    }

    public void setSessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
    }
    
    public String getSpotPrice() {
        return this.spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
      this.spotPrice = spotPrice;
    }
    
    public String getSshKeyContents() {
        return this.sshKeyContents;
    }

    public void setSshKeyContents(String sshKeyContents) {
      this.sshKeyContents = sshKeyContents;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
      this.subnetId = subnetId;
    }
    
    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
      this.tags = tags;
    }
    
    public Boolean getUseEbsOptimizedInstance() {
        return this.useEbsOptimizedInstance;
    }

    public void setUseEbsOptimizedInstance(Boolean useEbsOptimizedInstance) {
      this.useEbsOptimizedInstance = useEbsOptimizedInstance;
    }
    
    public Boolean getUsePrivateAddress() {
        return this.usePrivateAddress;
    }

    public void setUsePrivateAddress(Boolean usePrivateAddress) {
      this.usePrivateAddress = usePrivateAddress;
    }
    
    public String getUserdata() {
        return this.userdata;
    }

    public void setUserdata(String userdata) {
      this.userdata = userdata;
    }
    
    public String getVolumeType() {
        return this.volumeType;
    }

    public void setVolumeType(String volumeType) {
      this.volumeType = volumeType;
    }
    
    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
      this.vpcId = vpcId;
    }
    
    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
      this.zone = zone;
    }
    
}
