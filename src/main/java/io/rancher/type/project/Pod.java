package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Pod extends AbstractType {

    @JsonProperty("activeDeadlineSeconds")
    private Integer activeDeadlineSeconds;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("automountServiceAccountToken")
    private Boolean automountServiceAccountToken;

    @JsonProperty("containers")
    private List<Container> containers;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dnsConfig")
    private PodDNSConfig dnsConfig;

    @JsonProperty("dnsPolicy")
    private String dnsPolicy;

    @JsonProperty("enableServiceLinks")
    private Boolean enableServiceLinks;

    @JsonProperty("ephemeralContainers")
    private List<EphemeralContainer> ephemeralContainers;

    @JsonProperty("fsGroupChangePolicy")
    private String fsGroupChangePolicy;

    @JsonProperty("fsgid")
    private Integer fsgid;

    @JsonProperty("gids")
    private List<Integer> gids;

    @JsonProperty("hostAliases")
    private List<HostAlias> hostAliases;

    @JsonProperty("hostIPC")
    private Boolean hostIpc;

    @JsonProperty("hostNetwork")
    private Boolean hostNetwork;

    @JsonProperty("hostPID")
    private Boolean hostPid;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("imagePullSecrets")
    private List<LocalObjectReference> imagePullSecrets;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("nodeId")
    private String nodeId;

    @JsonProperty("overhead")
    private Map<String, Object> overhead;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("preemptionPolicy")
    private String preemptionPolicy;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;

    @JsonProperty("readinessGates")
    private List<PodReadinessGate> readinessGates;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("restartPolicy")
    private String restartPolicy;

    @JsonProperty("runAsGroup")
    private Integer runAsGroup;

    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;

    @JsonProperty("runtimeClassName")
    private String runtimeClassName;

    @JsonProperty("scheduling")
    private Scheduling scheduling;

    @JsonProperty("serviceAccountName")
    private String serviceAccountName;

    @JsonProperty("shareProcessNamespace")
    private Boolean shareProcessNamespace;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private PodStatus status;

    @JsonProperty("subdomain")
    private String subdomain;

    @JsonProperty("sysctls")
    private List<Sysctl> sysctls;

    @JsonProperty("terminationGracePeriodSeconds")
    private Integer terminationGracePeriodSeconds;

    @JsonProperty("topologySpreadConstraints")
    private List<TopologySpreadConstraint> topologySpreadConstraints;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uid")
    private Integer uid;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("volumes")
    private List<Volume> volumes;

    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;

    @JsonProperty("workloadId")
    private String workloadId;

    @JsonProperty("workloadMetrics")
    private List<WorkloadMetric> workloadMetrics;
}
