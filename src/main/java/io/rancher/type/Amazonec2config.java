package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
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
}
