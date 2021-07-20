package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    
    public String getAgentImageOverride() {
        return this.agentImageOverride;
    }

    public void setAgentImageOverride(String agentImageOverride) {
      this.agentImageOverride = agentImageOverride;
    }
    
    public String getDefaultClusterRoleForProjectMembers() {
        return this.defaultClusterRoleForProjectMembers;
    }

    public void setDefaultClusterRoleForProjectMembers(String defaultClusterRoleForProjectMembers) {
      this.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
    }
    
    public String getDefaultPodSecurityPolicyTemplateId() {
        return this.defaultPodSecurityPolicyTemplateId;
    }

    public void setDefaultPodSecurityPolicyTemplateId(String defaultPodSecurityPolicyTemplateId) {
      this.defaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
    }
    
    public String getDesiredAgentImage() {
        return this.desiredAgentImage;
    }

    public void setDesiredAgentImage(String desiredAgentImage) {
      this.desiredAgentImage = desiredAgentImage;
    }
    
    public String getDesiredAuthImage() {
        return this.desiredAuthImage;
    }

    public void setDesiredAuthImage(String desiredAuthImage) {
      this.desiredAuthImage = desiredAuthImage;
    }
    
    public String getDockerRootDir() {
        return this.dockerRootDir;
    }

    public void setDockerRootDir(String dockerRootDir) {
      this.dockerRootDir = dockerRootDir;
    }
    
    public Boolean getEnableClusterAlerting() {
        return this.enableClusterAlerting;
    }

    public void setEnableClusterAlerting(Boolean enableClusterAlerting) {
      this.enableClusterAlerting = enableClusterAlerting;
    }
    
    public Boolean getEnableClusterMonitoring() {
        return this.enableClusterMonitoring;
    }

    public void setEnableClusterMonitoring(Boolean enableClusterMonitoring) {
      this.enableClusterMonitoring = enableClusterMonitoring;
    }
    
    public Boolean getEnableNetworkPolicy() {
        return this.enableNetworkPolicy;
    }

    public void setEnableNetworkPolicy(Boolean enableNetworkPolicy) {
      this.enableNetworkPolicy = enableNetworkPolicy;
    }
    
    public LocalClusterAuthEndpoint getLocalClusterAuthEndpoint() {
        return this.localClusterAuthEndpoint;
    }

    public void setLocalClusterAuthEndpoint(LocalClusterAuthEndpoint localClusterAuthEndpoint) {
      this.localClusterAuthEndpoint = localClusterAuthEndpoint;
    }
    
    public RancherKubernetesEngineConfig getRancherKubernetesEngineConfig() {
        return this.rancherKubernetesEngineConfig;
    }

    public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfig rancherKubernetesEngineConfig) {
      this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
    }
    
    public ScheduledClusterScan getScheduledClusterScan() {
        return this.scheduledClusterScan;
    }

    public void setScheduledClusterScan(ScheduledClusterScan scheduledClusterScan) {
      this.scheduledClusterScan = scheduledClusterScan;
    }
    
    public Boolean getWindowsPreferedCluster() {
        return this.windowsPreferedCluster;
    }

    public void setWindowsPreferedCluster(Boolean windowsPreferedCluster) {
      this.windowsPreferedCluster = windowsPreferedCluster;
    }
    
}
