package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GlobalAwsOpts extends AbstractType {

    @JsonProperty("disable-security-group-ingress")
    private Boolean disableSecurityGroupIngress;

    @JsonProperty("disable-strict-zone-check")
    private Boolean disableStrictZoneCheck;

    @JsonProperty("elb-security-group")
    private String elbSecurityGroup;

    @JsonProperty("kubernetes-cluster-id")
    private String kubernetesClusterId;

    @JsonProperty("kubernetes-cluster-tag")
    private String kubernetesClusterTag;

    @JsonProperty("role-arn")
    private String roleArn;

    @JsonProperty("routetable-id")
    private String routetableId;

    @JsonProperty("subnet-id")
    private String subnetId;

    @JsonProperty("vpc")
    private String vpc;

    @JsonProperty("zone")
    private String zone;
}
