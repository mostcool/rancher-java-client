package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
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
}
