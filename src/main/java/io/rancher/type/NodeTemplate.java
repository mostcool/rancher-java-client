package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class NodeTemplate extends AbstractType {
    
    @JsonProperty("amazonec2Config")
    private Amazonec2config amazonec2config;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("authCertificateAuthority")
    private String authCertificateAuthority;
    
    @JsonProperty("authKey")
    private String authKey;
    
    @JsonProperty("azureConfig")
    private Azureconfig azureConfig;
    
    @JsonProperty("cloudCredentialId")
    private String cloudCredentialId;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("digitaloceanConfig")
    private Digitaloceanconfig digitaloceanConfig;
    
    @JsonProperty("dockerVersion")
    private String dockerVersion;
    
    @JsonProperty("driver")
    private String driver;
    
    @JsonProperty("engineEnv")
    private Map<String, Object> engineEnv;
    
    @JsonProperty("engineInsecureRegistry")
    private List<String> engineInsecureRegistry;
    
    @JsonProperty("engineInstallURL")
    private String engineInstallUrl;
    
    @JsonProperty("engineLabel")
    private Map<String, Object> engineLabel;
    
    @JsonProperty("engineOpt")
    private Map<String, Object> engineOpt;
    
    @JsonProperty("engineRegistryMirror")
    private List<String> engineRegistryMirror;
    
    @JsonProperty("engineStorageDriver")
    private String engineStorageDriver;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("linodeConfig")
    private Linodeconfig linodeConfig;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nodeTaints")
    private List<Taint> nodeTaints;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private NodeTemplateStatus status;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("useInternalIpAddress")
    private Boolean useInternalIpAddress;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("vmwarevsphereConfig")
    private Vmwarevsphereconfig vmwarevsphereConfig;
    
    public Amazonec2config getAmazonec2config() {
        return this.amazonec2config;
    }

    public void setAmazonec2config(Amazonec2config amazonec2config) {
      this.amazonec2config = amazonec2config;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAuthCertificateAuthority() {
        return this.authCertificateAuthority;
    }

    public void setAuthCertificateAuthority(String authCertificateAuthority) {
      this.authCertificateAuthority = authCertificateAuthority;
    }
    
    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
      this.authKey = authKey;
    }
    
    public Azureconfig getAzureConfig() {
        return this.azureConfig;
    }

    public void setAzureConfig(Azureconfig azureConfig) {
      this.azureConfig = azureConfig;
    }
    
    public String getCloudCredentialId() {
        return this.cloudCredentialId;
    }

    public void setCloudCredentialId(String cloudCredentialId) {
      this.cloudCredentialId = cloudCredentialId;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Digitaloceanconfig getDigitaloceanConfig() {
        return this.digitaloceanConfig;
    }

    public void setDigitaloceanConfig(Digitaloceanconfig digitaloceanConfig) {
      this.digitaloceanConfig = digitaloceanConfig;
    }
    
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
      this.dockerVersion = dockerVersion;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Map<String, Object> getEngineEnv() {
        return this.engineEnv;
    }

    public void setEngineEnv(Map<String, Object> engineEnv) {
      this.engineEnv = engineEnv;
    }
    
    public List<String> getEngineInsecureRegistry() {
        return this.engineInsecureRegistry;
    }

    public void setEngineInsecureRegistry(List<String> engineInsecureRegistry) {
      this.engineInsecureRegistry = engineInsecureRegistry;
    }
    
    public String getEngineInstallUrl() {
        return this.engineInstallUrl;
    }

    public void setEngineInstallUrl(String engineInstallUrl) {
      this.engineInstallUrl = engineInstallUrl;
    }
    
    public Map<String, Object> getEngineLabel() {
        return this.engineLabel;
    }

    public void setEngineLabel(Map<String, Object> engineLabel) {
      this.engineLabel = engineLabel;
    }
    
    public Map<String, Object> getEngineOpt() {
        return this.engineOpt;
    }

    public void setEngineOpt(Map<String, Object> engineOpt) {
      this.engineOpt = engineOpt;
    }
    
    public List<String> getEngineRegistryMirror() {
        return this.engineRegistryMirror;
    }

    public void setEngineRegistryMirror(List<String> engineRegistryMirror) {
      this.engineRegistryMirror = engineRegistryMirror;
    }
    
    public String getEngineStorageDriver() {
        return this.engineStorageDriver;
    }

    public void setEngineStorageDriver(String engineStorageDriver) {
      this.engineStorageDriver = engineStorageDriver;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Linodeconfig getLinodeConfig() {
        return this.linodeConfig;
    }

    public void setLinodeConfig(Linodeconfig linodeConfig) {
      this.linodeConfig = linodeConfig;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<Taint> getNodeTaints() {
        return this.nodeTaints;
    }

    public void setNodeTaints(List<Taint> nodeTaints) {
      this.nodeTaints = nodeTaints;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public NodeTemplateStatus getStatus() {
        return this.status;
    }

    public void setStatus(NodeTemplateStatus status) {
      this.status = status;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Boolean getUseInternalIpAddress() {
        return this.useInternalIpAddress;
    }

    public void setUseInternalIpAddress(Boolean useInternalIpAddress) {
      this.useInternalIpAddress = useInternalIpAddress;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Vmwarevsphereconfig getVmwarevsphereConfig() {
        return this.vmwarevsphereConfig;
    }

    public void setVmwarevsphereConfig(Vmwarevsphereconfig vmwarevsphereConfig) {
      this.vmwarevsphereConfig = vmwarevsphereConfig;
    }
    
}
