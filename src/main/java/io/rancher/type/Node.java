package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Node extends AbstractType {

    @JsonProperty("allocatable")
    private Map<String, Object> allocatable;

    @JsonProperty("amazonec2Config")
    private Amazonec2config amazonec2config;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("appliedNodeVersion")
    private Integer appliedNodeVersion;

    @JsonProperty("azureConfig")
    private Azureconfig azureConfig;

    @JsonProperty("capacity")
    private Map<String, Object> capacity;

    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("conditions")
    private List<NodeCondition> conditions;

    @JsonProperty("controlPlane")
    private Boolean controlPlane;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("customConfig")
    private CustomConfig customConfig;

    @JsonProperty("description")
    private String description;

    @JsonProperty("digitaloceanConfig")
    private Digitaloceanconfig digitaloceanConfig;

    @JsonProperty("dockerInfo")
    private DockerInfo dockerInfo;

    @JsonProperty("etcd")
    private Boolean etcd;

    @JsonProperty("externalIpAddress")
    private String externalIpAddress;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("imported")
    private Boolean imported;

    @JsonProperty("info")
    private NodeInfo info;

    @JsonProperty("ipAddress")
    private String ipAddress;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("limits")
    private Map<String, Object> limits;

    @JsonProperty("linodeConfig")
    private Linodeconfig linodeConfig;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("nodeName")
    private String nodeName;

    @JsonProperty("nodePlan")
    private NodePlan nodePlan;

    @JsonProperty("nodePoolId")
    private String nodePoolId;

    @JsonProperty("nodeTaints")
    private List<Taint> nodeTaints;

    @JsonProperty("nodeTemplateId")
    private String nodeTemplateId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("podCidr")
    private String podCidr;

    @JsonProperty("podCidrs")
    private List<String> podCidrs;

    @JsonProperty("providerId")
    private String providerId;

    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("requested")
    private Map<String, Object> requested;

    /**
     * required true
     */
    @JsonProperty("requestedHostname")
    private String requestedHostname;

    @JsonProperty("sshUser")
    private String sshUser;

    @JsonProperty("state")
    private String state;

    @JsonProperty("taints")
    private List<Taint> taints;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("unschedulable")
    private Boolean unschedulable;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vmwarevsphereConfig")
    private Vmwarevsphereconfig vmwarevsphereConfig;

    @JsonProperty("volumesAttached")
    private Map<String, Object> volumesAttached;

    @JsonProperty("volumesInUse")
    private List<String> volumesInUse;

    @JsonProperty("worker")
    private Boolean worker;
}
