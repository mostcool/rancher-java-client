package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class AmazonElasticContainerServiceConfig extends AbstractType {

    @JsonProperty("accessKey")
    private String accessKey;

    @JsonProperty("ami")
    private String ami;

    @JsonProperty("associateWorkerNodePublicIp")
    private Boolean associateWorkerNodePublicIp;

    @JsonProperty("desiredNodes")
    private Integer desiredNodes;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("driverName")
    private String driverName;

    @JsonProperty("ebsEncryption")
    private Boolean ebsEncryption;

    @JsonProperty("instanceType")
    private String instanceType;

    @JsonProperty("keyPairName")
    private String keyPairName;

    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;

    @JsonProperty("maximumNodes")
    private Integer maximumNodes;

    @JsonProperty("minimumNodes")
    private Integer minimumNodes;

    @JsonProperty("nodeVolumeSize")
    private Integer nodeVolumeSize;

    @JsonProperty("region")
    private String region;

    @JsonProperty("secretKey")
    private String secretKey;

    @JsonProperty("securityGroups")
    private List<String> securityGroups;

    @JsonProperty("serviceRole")
    private String serviceRole;

    @JsonProperty("sessionToken")
    private String sessionToken;

    @JsonProperty("subnets")
    private List<String> subnets;

    @JsonProperty("userData")
    private String userData;

    @JsonProperty("virtualNetwork")
    private String virtualNetwork;
}
