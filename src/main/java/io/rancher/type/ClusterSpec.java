package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterSpec extends AbstractType {

    @JsonProperty("agentImageOverride")
    private String agentImageOverride;

    @JsonProperty("amazonElasticContainerServiceConfig")
    private Map<String, Object> amazonElasticContainerServiceConfig;

    @JsonProperty("answers")
    private Answer answers;

    @JsonProperty("azureKubernetesServiceConfig")
    private Map<String, Object> azureKubernetesServiceConfig;

    @JsonProperty("clusterTemplateId")
    private String clusterTemplateId;

    @JsonProperty("clusterTemplateRevisionId")
    private String clusterTemplateRevisionId;

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

    /**
     * required true
     */
    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("dockerRootDir")
    private String dockerRootDir;

    @JsonProperty("enableClusterAlerting")
    private Boolean enableClusterAlerting;

    @JsonProperty("enableClusterMonitoring")
    private Boolean enableClusterMonitoring;

    @JsonProperty("enableNetworkPolicy")
    private Boolean enableNetworkPolicy;

    @JsonProperty("genericEngineConfig")
    private Map<String, Object> genericEngineConfig;

    @JsonProperty("googleKubernetesEngineConfig")
    private Map<String, Object> googleKubernetesEngineConfig;

    @JsonProperty("importedConfig")
    private ImportedConfig importedConfig;

    @JsonProperty("internal")
    private Boolean internal;

    @JsonProperty("k3sConfig")
    private K3sConfig k3sConfig;

    @JsonProperty("localClusterAuthEndpoint")
    private LocalClusterAuthEndpoint localClusterAuthEndpoint;

    @JsonProperty("questions")
    private List<Question> questions;

    @JsonProperty("rancherKubernetesEngineConfig")
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;

    @JsonProperty("scheduledClusterScan")
    private ScheduledClusterScan scheduledClusterScan;

    @JsonProperty("windowsPreferedCluster")
    private Boolean windowsPreferedCluster;
}
