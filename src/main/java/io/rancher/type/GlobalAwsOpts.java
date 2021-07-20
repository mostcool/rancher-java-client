package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

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
    
    public Boolean getDisableSecurityGroupIngress() {
        return this.disableSecurityGroupIngress;
    }

    public void setDisableSecurityGroupIngress(Boolean disableSecurityGroupIngress) {
      this.disableSecurityGroupIngress = disableSecurityGroupIngress;
    }
    
    public Boolean getDisableStrictZoneCheck() {
        return this.disableStrictZoneCheck;
    }

    public void setDisableStrictZoneCheck(Boolean disableStrictZoneCheck) {
      this.disableStrictZoneCheck = disableStrictZoneCheck;
    }
    
    public String getElbSecurityGroup() {
        return this.elbSecurityGroup;
    }

    public void setElbSecurityGroup(String elbSecurityGroup) {
      this.elbSecurityGroup = elbSecurityGroup;
    }
    
    public String getKubernetesClusterId() {
        return this.kubernetesClusterId;
    }

    public void setKubernetesClusterId(String kubernetesClusterId) {
      this.kubernetesClusterId = kubernetesClusterId;
    }
    
    public String getKubernetesClusterTag() {
        return this.kubernetesClusterTag;
    }

    public void setKubernetesClusterTag(String kubernetesClusterTag) {
      this.kubernetesClusterTag = kubernetesClusterTag;
    }
    
    public String getRoleArn() {
        return this.roleArn;
    }

    public void setRoleArn(String roleArn) {
      this.roleArn = roleArn;
    }
    
    public String getRoutetableId() {
        return this.routetableId;
    }

    public void setRoutetableId(String routetableId) {
      this.routetableId = routetableId;
    }
    
    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
      this.subnetId = subnetId;
    }
    
    public String getVpc() {
        return this.vpc;
    }

    public void setVpc(String vpc) {
      this.vpc = vpc;
    }
    
    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
      this.zone = zone;
    }
    
}
