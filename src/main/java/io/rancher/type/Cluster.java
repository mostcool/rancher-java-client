package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Cluster extends AbstractType {

    @JsonProperty("agentFeatures")
    private Map<String, Object> agentFeatures;

    @JsonProperty("agentImage")
    private String agentImage;

    @JsonProperty("agentImageOverride")
    private String agentImageOverride;

    @JsonProperty("allocatable")
    private Map<String, Object> allocatable;

    @JsonProperty("amazonElasticContainerServiceConfig")
    private AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("answers")
    private Answer answers;

    @JsonProperty("apiEndpoint")
    private String apiEndpoint;

    @JsonProperty("appliedEnableNetworkPolicy")
    private Boolean appliedEnableNetworkPolicy;

    @JsonProperty("appliedPodSecurityPolicyTemplateId")
    private String appliedPodSecurityPolicyTemplateId;

    @JsonProperty("appliedSpec")
    private ClusterSpec appliedSpec;

    @JsonProperty("authImage")
    private String authImage;

    @JsonProperty("azureKubernetesServiceConfig")
    private AzureKubernetesServiceConfig azureKubernetesServiceConfig;

    @JsonProperty("caCert")
    private String caCert;

    @JsonProperty("capabilities")
    private Capabilities capabilities;

    @JsonProperty("capacity")
    private Map<String, Object> capacity;

    @JsonProperty("certificatesExpiration")
    private Map<String, Object> certificatesExpiration;

    @JsonProperty("clusterTemplateId")
    private String clusterTemplateId;

    @JsonProperty("clusterTemplateRevisionId")
    private String clusterTemplateRevisionId;

    @JsonProperty("componentStatuses")
    private List<ClusterComponentStatus> componentStatuses;

    @JsonProperty("conditions")
    private List<ClusterCondition> conditions;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("currentCisRunName")
    private String currentCisRunName;

    @JsonProperty("defaultClusterRoleForProjectMembers")
    private String defaultClusterRoleForProjectMembers;

    @JsonProperty("defaultPodSecurityPolicyTemplateId")
    private String defaultPodSecurityPolicyTemplateId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("desiredAgentImage")
    private String desiredAgentImage;

    @JsonProperty("desiredAuthImage")
    private String desiredAuthImage;

    @JsonProperty("dockerRootDir")
    private String dockerRootDir;

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("enableClusterAlerting")
    private Boolean enableClusterAlerting;

    @JsonProperty("enableClusterMonitoring")
    private Boolean enableClusterMonitoring;

    @JsonProperty("enableNetworkPolicy")
    private Boolean enableNetworkPolicy;

    @JsonProperty("failedSpec")
    private ClusterSpec failedSpec;

    @JsonProperty("googleKubernetesEngineConfig")
    private GoogleKubernetesEngineConfig googleKubernetesEngineConfig;

    @JsonProperty("importedConfig")
    private ImportedConfig importedConfig;

    @JsonProperty("internal")
    private Boolean internal;

    @JsonProperty("istioEnabled")
    private Boolean istioEnabled;

    @JsonProperty("k3sConfig")
    private K3sConfig k3sConfig;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("limits")
    private Map<String, Object> limits;

    @JsonProperty("localClusterAuthEndpoint")
    private LocalClusterAuthEndpoint localClusterAuthEndpoint;

    @JsonProperty("monitoringStatus")
    private MonitoringStatus monitoringStatus;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nodeCount")
    private Integer nodeCount;

    @JsonProperty("nodeVersion")
    private Integer nodeVersion;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("questions")
    private List<Question> questions;

    @JsonProperty("rancherKubernetesEngineConfig")
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("requested")
    private Map<String, Object> requested;

    @JsonProperty("scheduledClusterScan")
    private ScheduledClusterScan scheduledClusterScan;

    @JsonProperty("scheduledClusterScanStatus")
    private ScheduledClusterScanStatus scheduledClusterScanStatus;

    @JsonProperty("state")
    private String state;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version")
    private Info version;

    @JsonProperty("windowsPreferedCluster")
    private Boolean windowsPreferedCluster;
}
