package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ClusterSpecBase extends AbstractType {

    @JsonProperty("agentImageOverride")
    private String agentImageOverride;

    @JsonProperty("defaultClusterRoleForProjectMembers")
    private String defaultClusterRoleForProjectMembers;

    @JsonProperty("defaultPodSecurityPolicyTemplateId")
    private String defaultPodSecurityPolicyTemplateId;

    @JsonProperty("desiredAgentImage")
    private String desiredAgentImage;

    @JsonProperty("desiredAuthImage")
    private String desiredAuthImage;

    @JsonProperty("dockerRootDir")
    private String dockerRootDir;

    @JsonProperty("enableClusterAlerting")
    private Boolean enableClusterAlerting;

    @JsonProperty("enableClusterMonitoring")
    private Boolean enableClusterMonitoring;

    @JsonProperty("enableNetworkPolicy")
    private Boolean enableNetworkPolicy;

    @JsonProperty("localClusterAuthEndpoint")
    private LocalClusterAuthEndpoint localClusterAuthEndpoint;

    @JsonProperty("rancherKubernetesEngineConfig")
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;

    @JsonProperty("scheduledClusterScan")
    private ScheduledClusterScan scheduledClusterScan;

    @JsonProperty("windowsPreferedCluster")
    private Boolean windowsPreferedCluster;
}
