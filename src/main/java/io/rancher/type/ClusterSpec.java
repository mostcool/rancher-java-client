package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

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
    
    public String getAgentImageOverride() {
        return this.agentImageOverride;
    }

    public void setAgentImageOverride(String agentImageOverride) {
      this.agentImageOverride = agentImageOverride;
    }
    
    public Map<String, Object> getAmazonElasticContainerServiceConfig() {
        return this.amazonElasticContainerServiceConfig;
    }

    public void setAmazonElasticContainerServiceConfig(Map<String, Object> amazonElasticContainerServiceConfig) {
      this.amazonElasticContainerServiceConfig = amazonElasticContainerServiceConfig;
    }
    
    public Answer getAnswers() {
        return this.answers;
    }

    public void setAnswers(Answer answers) {
      this.answers = answers;
    }
    
    public Map<String, Object> getAzureKubernetesServiceConfig() {
        return this.azureKubernetesServiceConfig;
    }

    public void setAzureKubernetesServiceConfig(Map<String, Object> azureKubernetesServiceConfig) {
      this.azureKubernetesServiceConfig = azureKubernetesServiceConfig;
    }
    
    public String getClusterTemplateId() {
        return this.clusterTemplateId;
    }

    public void setClusterTemplateId(String clusterTemplateId) {
      this.clusterTemplateId = clusterTemplateId;
    }
    
    public String getClusterTemplateRevisionId() {
        return this.clusterTemplateRevisionId;
    }

    public void setClusterTemplateRevisionId(String clusterTemplateRevisionId) {
      this.clusterTemplateRevisionId = clusterTemplateRevisionId;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
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
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
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
    
    public Map<String, Object> getGenericEngineConfig() {
        return this.genericEngineConfig;
    }

    public void setGenericEngineConfig(Map<String, Object> genericEngineConfig) {
      this.genericEngineConfig = genericEngineConfig;
    }
    
    public Map<String, Object> getGoogleKubernetesEngineConfig() {
        return this.googleKubernetesEngineConfig;
    }

    public void setGoogleKubernetesEngineConfig(Map<String, Object> googleKubernetesEngineConfig) {
      this.googleKubernetesEngineConfig = googleKubernetesEngineConfig;
    }
    
    public ImportedConfig getImportedConfig() {
        return this.importedConfig;
    }

    public void setImportedConfig(ImportedConfig importedConfig) {
      this.importedConfig = importedConfig;
    }
    
    public Boolean getInternal() {
        return this.internal;
    }

    public void setInternal(Boolean internal) {
      this.internal = internal;
    }
    
    public K3sConfig getK3sConfig() {
        return this.k3sConfig;
    }

    public void setK3sConfig(K3sConfig k3sConfig) {
      this.k3sConfig = k3sConfig;
    }
    
    public LocalClusterAuthEndpoint getLocalClusterAuthEndpoint() {
        return this.localClusterAuthEndpoint;
    }

    public void setLocalClusterAuthEndpoint(LocalClusterAuthEndpoint localClusterAuthEndpoint) {
      this.localClusterAuthEndpoint = localClusterAuthEndpoint;
    }
    
    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
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
