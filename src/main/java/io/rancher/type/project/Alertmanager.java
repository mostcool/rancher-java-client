package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Alertmanager extends AbstractType {
    
    @JsonProperty("additionalPeers")
    private List<String> additionalPeers;
    
    @JsonProperty("affinity")
    private Affinity affinity;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("baseImage")
    private String baseImage;
    
    @JsonProperty("configMaps")
    private List<String> configMaps;
    
    @JsonProperty("configSecret")
    private String configSecret;
    
    @JsonProperty("containers")
    private List<Container> containers;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("externalUrl")
    private String externalUrl;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("imagePullSecrets")
    private List<LocalObjectReference> imagePullSecrets;
    
    @JsonProperty("initContainers")
    private List<Container> initContainers;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("listenLocal")
    private Boolean listenLocal;
    
    @JsonProperty("logFormat")
    private String logFormat;
    
    @JsonProperty("logLevel")
    private String logLevel;
    
    @JsonProperty("name")
    private String name;
    
    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("paused")
    private Boolean paused;
    
    @JsonProperty("podMetadata")
    private ObjectMeta podMetadata;
    
    @JsonProperty("portName")
    private String portName;
    
    @JsonProperty("priorityClassName")
    private String priorityClassName;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("replicas")
    private Integer replicas;
    
    @JsonProperty("resources")
    private ResourceRequirements resources;
    
    @JsonProperty("retention")
    private String retention;
    
    @JsonProperty("routePrefix")
    private String routePrefix;
    
    @JsonProperty("secrets")
    private List<String> secrets;
    
    @JsonProperty("securityContext")
    private PodSecurityContext securityContext;
    
    @JsonProperty("serviceAccountName")
    private String serviceAccountName;
    
    @JsonProperty("sha")
    private String sha;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("storage")
    private StorageSpec storage;
    
    @JsonProperty("tag")
    private String tag;
    
    @JsonProperty("tolerations")
    private List<Toleration> tolerations;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("version")
    private String version;
    
    @JsonProperty("volumeMounts")
    private List<VolumeMount> volumeMounts;
    
    @JsonProperty("volumes")
    private List<Volume> volumes;
    
    public List<String> getAdditionalPeers() {
        return this.additionalPeers;
    }

    public void setAdditionalPeers(List<String> additionalPeers) {
      this.additionalPeers = additionalPeers;
    }
    
    public Affinity getAffinity() {
        return this.affinity;
    }

    public void setAffinity(Affinity affinity) {
      this.affinity = affinity;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getBaseImage() {
        return this.baseImage;
    }

    public void setBaseImage(String baseImage) {
      this.baseImage = baseImage;
    }
    
    public List<String> getConfigMaps() {
        return this.configMaps;
    }

    public void setConfigMaps(List<String> configMaps) {
      this.configMaps = configMaps;
    }
    
    public String getConfigSecret() {
        return this.configSecret;
    }

    public void setConfigSecret(String configSecret) {
      this.configSecret = configSecret;
    }
    
    public List<Container> getContainers() {
        return this.containers;
    }

    public void setContainers(List<Container> containers) {
      this.containers = containers;
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
    
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
      this.externalUrl = externalUrl;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public List<LocalObjectReference> getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
      this.imagePullSecrets = imagePullSecrets;
    }
    
    public List<Container> getInitContainers() {
        return this.initContainers;
    }

    public void setInitContainers(List<Container> initContainers) {
      this.initContainers = initContainers;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Boolean getListenLocal() {
        return this.listenLocal;
    }

    public void setListenLocal(Boolean listenLocal) {
      this.listenLocal = listenLocal;
    }
    
    public String getLogFormat() {
        return this.logFormat;
    }

    public void setLogFormat(String logFormat) {
      this.logFormat = logFormat;
    }
    
    public String getLogLevel() {
        return this.logLevel;
    }

    public void setLogLevel(String logLevel) {
      this.logLevel = logLevel;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Boolean getPaused() {
        return this.paused;
    }

    public void setPaused(Boolean paused) {
      this.paused = paused;
    }
    
    public ObjectMeta getPodMetadata() {
        return this.podMetadata;
    }

    public void setPodMetadata(ObjectMeta podMetadata) {
      this.podMetadata = podMetadata;
    }
    
    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
      this.portName = portName;
    }
    
    public String getPriorityClassName() {
        return this.priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
      this.priorityClassName = priorityClassName;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Integer getReplicas() {
        return this.replicas;
    }

    public void setReplicas(Integer replicas) {
      this.replicas = replicas;
    }
    
    public ResourceRequirements getResources() {
        return this.resources;
    }

    public void setResources(ResourceRequirements resources) {
      this.resources = resources;
    }
    
    public String getRetention() {
        return this.retention;
    }

    public void setRetention(String retention) {
      this.retention = retention;
    }
    
    public String getRoutePrefix() {
        return this.routePrefix;
    }

    public void setRoutePrefix(String routePrefix) {
      this.routePrefix = routePrefix;
    }
    
    public List<String> getSecrets() {
        return this.secrets;
    }

    public void setSecrets(List<String> secrets) {
      this.secrets = secrets;
    }
    
    public PodSecurityContext getSecurityContext() {
        return this.securityContext;
    }

    public void setSecurityContext(PodSecurityContext securityContext) {
      this.securityContext = securityContext;
    }
    
    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
      this.serviceAccountName = serviceAccountName;
    }
    
    public String getSha() {
        return this.sha;
    }

    public void setSha(String sha) {
      this.sha = sha;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public StorageSpec getStorage() {
        return this.storage;
    }

    public void setStorage(StorageSpec storage) {
      this.storage = storage;
    }
    
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
      this.tag = tag;
    }
    
    public List<Toleration> getTolerations() {
        return this.tolerations;
    }

    public void setTolerations(List<Toleration> tolerations) {
      this.tolerations = tolerations;
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
    public List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
      this.volumeMounts = volumeMounts;
    }
    
    public List<Volume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<Volume> volumes) {
      this.volumes = volumes;
    }
    
}
