package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class DnsRecord extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("clusterIp")
    private String clusterIp;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("ipAddresses")
    private List<String> ipAddresses;

    @JsonProperty("ipFamily")
    private String ipFamily;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("ports")
    private List<ServicePort> ports;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("selector")
    private Map<String, Object> selector;

    @JsonProperty("state")
    private String state;

    @JsonProperty("targetDnsRecordIds")
    private List<String> targetDnsRecordIds;

    @JsonProperty("targetWorkloadIds")
    private List<String> targetWorkloadIds;

    @JsonProperty("topologyKeys")
    private List<String> topologyKeys;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("workloadId")
    private String workloadId;
}
