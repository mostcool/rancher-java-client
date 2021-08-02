package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResourceQuotaLimit extends AbstractType {

    @JsonProperty("configMaps")
    private String configMaps;

    @JsonProperty("limitsCpu")
    private String limitsCpu;

    @JsonProperty("limitsMemory")
    private String limitsMemory;

    @JsonProperty("persistentVolumeClaims")
    private String persistentVolumeClaims;

    @JsonProperty("pods")
    private String pods;

    @JsonProperty("replicationControllers")
    private String replicationControllers;

    @JsonProperty("requestsCpu")
    private String requestsCpu;

    @JsonProperty("requestsMemory")
    private String requestsMemory;

    @JsonProperty("requestsStorage")
    private String requestsStorage;

    @JsonProperty("secrets")
    private String secrets;

    @JsonProperty("services")
    private String services;

    @JsonProperty("servicesLoadBalancers")
    private String servicesLoadBalancers;

    @JsonProperty("servicesNodePorts")
    private String servicesNodePorts;
}
