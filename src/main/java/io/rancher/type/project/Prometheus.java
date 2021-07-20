package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Prometheus extends AbstractType {
    
    @JsonProperty("additionalAlertManagerConfigs")
    private SecretKeySelector additionalAlertManagerConfigs;
    
    @JsonProperty("additionalAlertRelabelConfigs")
    private SecretKeySelector additionalAlertRelabelConfigs;
    
    @JsonProperty("additionalScrapeConfigs")
    private SecretKeySelector additionalScrapeConfigs;
    
    @JsonProperty("affinity")
    private Affinity affinity;
    
    @JsonProperty("alerting")
    private AlertingSpec alerting;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("arbitraryFSAccessThroughSMs")
    private ArbitraryFSAccessThroughSMsConfig arbitraryFsaccessThroughSms;
    
    @JsonProperty("baseImage")
    private String baseImage;
    
    @JsonProperty("configMaps")
    private List<String> configMaps;
    
    @JsonProperty("containers")
    private List<Container> containers;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("disableCompaction")
    private Boolean disableCompaction;
    
    @JsonProperty("enableAdminAPI")
    private Boolean enableAdminApi;
    
    @JsonProperty("enforcedNamespaceLabel")
    private String enforcedNamespaceLabel;
    
    @JsonProperty("evaluationInterval")
    private String evaluationInterval;
    
    @JsonProperty("externalLabels")
    private Map<String, Object> externalLabels;
    
    @JsonProperty("externalUrl")
    private String externalUrl;
    
    @JsonProperty("ignoreNamespaceSelectors")
    private Boolean ignoreNamespaceSelectors;
    
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
    
    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;
    
    @JsonProperty("overrideHonorLabels")
    private Boolean overrideHonorLabels;
    
    @JsonProperty("overrideHonorTimestamps")
    private Boolean overrideHonorTimestamps;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("podMetadata")
    private ObjectMeta podMetadata;
    
    @JsonProperty("podMonitorNamespaceSelector")
    private LabelSelector podMonitorNamespaceSelector;
    
    @JsonProperty("podMonitorSelector")
    private LabelSelector podMonitorSelector;
    
    @JsonProperty("portName")
    private String portName;
    
    @JsonProperty("priorityClassName")
    private String priorityClassName;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("prometheusExternalLabelName")
    private String prometheusExternalLabelName;
    
    @JsonProperty("query")
    private QuerySpec query;
    
    @JsonProperty("remoteRead")
    private List<RemoteReadSpec> remoteRead;
    
    @JsonProperty("remoteWrite")
    private List<RemoteWriteSpec> remoteWrite;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("replicaExternalLabelName")
    private String replicaExternalLabelName;
    
    @JsonProperty("replicas")
    private Integer replicas;
    
    @JsonProperty("resources")
    private ResourceRequirements resources;
    
    @JsonProperty("retention")
    private String retention;
    
    @JsonProperty("retentionSize")
    private String retentionSize;
    
    @JsonProperty("routePrefix")
    private String routePrefix;
    
    @JsonProperty("ruleSelector")
    private LabelSelector ruleSelector;
    
    @JsonProperty("rules")
    private Rules rules;
    
    @JsonProperty("scrapeInterval")
    private String scrapeInterval;
    
    @JsonProperty("secrets")
    private List<String> secrets;
    
    @JsonProperty("securityContext")
    private PodSecurityContext securityContext;
    
    @JsonProperty("serviceAccountName")
    private String serviceAccountName;
    
    @JsonProperty("serviceMonitorSelector")
    private LabelSelector serviceMonitorSelector;
    
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
    
    @JsonProperty("volumes")
    private List<Volume> volumes;
    
    @JsonProperty("walCompression")
    private Boolean walCompression;
    
    public SecretKeySelector getAdditionalAlertManagerConfigs() {
        return this.additionalAlertManagerConfigs;
    }

    public void setAdditionalAlertManagerConfigs(SecretKeySelector additionalAlertManagerConfigs) {
      this.additionalAlertManagerConfigs = additionalAlertManagerConfigs;
    }
    
    public SecretKeySelector getAdditionalAlertRelabelConfigs() {
        return this.additionalAlertRelabelConfigs;
    }

    public void setAdditionalAlertRelabelConfigs(SecretKeySelector additionalAlertRelabelConfigs) {
      this.additionalAlertRelabelConfigs = additionalAlertRelabelConfigs;
    }
    
    public SecretKeySelector getAdditionalScrapeConfigs() {
        return this.additionalScrapeConfigs;
    }

    public void setAdditionalScrapeConfigs(SecretKeySelector additionalScrapeConfigs) {
      this.additionalScrapeConfigs = additionalScrapeConfigs;
    }
    
    public Affinity getAffinity() {
        return this.affinity;
    }

    public void setAffinity(Affinity affinity) {
      this.affinity = affinity;
    }
    
    public AlertingSpec getAlerting() {
        return this.alerting;
    }

    public void setAlerting(AlertingSpec alerting) {
      this.alerting = alerting;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public ArbitraryFSAccessThroughSMsConfig getArbitraryFsaccessThroughSms() {
        return this.arbitraryFsaccessThroughSms;
    }

    public void setArbitraryFsaccessThroughSms(ArbitraryFSAccessThroughSMsConfig arbitraryFsaccessThroughSms) {
      this.arbitraryFsaccessThroughSms = arbitraryFsaccessThroughSms;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getDisableCompaction() {
        return this.disableCompaction;
    }

    public void setDisableCompaction(Boolean disableCompaction) {
      this.disableCompaction = disableCompaction;
    }
    
    public Boolean getEnableAdminApi() {
        return this.enableAdminApi;
    }

    public void setEnableAdminApi(Boolean enableAdminApi) {
      this.enableAdminApi = enableAdminApi;
    }
    
    public String getEnforcedNamespaceLabel() {
        return this.enforcedNamespaceLabel;
    }

    public void setEnforcedNamespaceLabel(String enforcedNamespaceLabel) {
      this.enforcedNamespaceLabel = enforcedNamespaceLabel;
    }
    
    public String getEvaluationInterval() {
        return this.evaluationInterval;
    }

    public void setEvaluationInterval(String evaluationInterval) {
      this.evaluationInterval = evaluationInterval;
    }
    
    public Map<String, Object> getExternalLabels() {
        return this.externalLabels;
    }

    public void setExternalLabels(Map<String, Object> externalLabels) {
      this.externalLabels = externalLabels;
    }
    
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
      this.externalUrl = externalUrl;
    }
    
    public Boolean getIgnoreNamespaceSelectors() {
        return this.ignoreNamespaceSelectors;
    }

    public void setIgnoreNamespaceSelectors(Boolean ignoreNamespaceSelectors) {
      this.ignoreNamespaceSelectors = ignoreNamespaceSelectors;
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
    
    public Boolean getOverrideHonorLabels() {
        return this.overrideHonorLabels;
    }

    public void setOverrideHonorLabels(Boolean overrideHonorLabels) {
      this.overrideHonorLabels = overrideHonorLabels;
    }
    
    public Boolean getOverrideHonorTimestamps() {
        return this.overrideHonorTimestamps;
    }

    public void setOverrideHonorTimestamps(Boolean overrideHonorTimestamps) {
      this.overrideHonorTimestamps = overrideHonorTimestamps;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public ObjectMeta getPodMetadata() {
        return this.podMetadata;
    }

    public void setPodMetadata(ObjectMeta podMetadata) {
      this.podMetadata = podMetadata;
    }
    
    public LabelSelector getPodMonitorNamespaceSelector() {
        return this.podMonitorNamespaceSelector;
    }

    public void setPodMonitorNamespaceSelector(LabelSelector podMonitorNamespaceSelector) {
      this.podMonitorNamespaceSelector = podMonitorNamespaceSelector;
    }
    
    public LabelSelector getPodMonitorSelector() {
        return this.podMonitorSelector;
    }

    public void setPodMonitorSelector(LabelSelector podMonitorSelector) {
      this.podMonitorSelector = podMonitorSelector;
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
    
    public String getPrometheusExternalLabelName() {
        return this.prometheusExternalLabelName;
    }

    public void setPrometheusExternalLabelName(String prometheusExternalLabelName) {
      this.prometheusExternalLabelName = prometheusExternalLabelName;
    }
    
    public QuerySpec getQuery() {
        return this.query;
    }

    public void setQuery(QuerySpec query) {
      this.query = query;
    }
    
    public List<RemoteReadSpec> getRemoteRead() {
        return this.remoteRead;
    }

    public void setRemoteRead(List<RemoteReadSpec> remoteRead) {
      this.remoteRead = remoteRead;
    }
    
    public List<RemoteWriteSpec> getRemoteWrite() {
        return this.remoteWrite;
    }

    public void setRemoteWrite(List<RemoteWriteSpec> remoteWrite) {
      this.remoteWrite = remoteWrite;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getReplicaExternalLabelName() {
        return this.replicaExternalLabelName;
    }

    public void setReplicaExternalLabelName(String replicaExternalLabelName) {
      this.replicaExternalLabelName = replicaExternalLabelName;
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
    
    public String getRetentionSize() {
        return this.retentionSize;
    }

    public void setRetentionSize(String retentionSize) {
      this.retentionSize = retentionSize;
    }
    
    public String getRoutePrefix() {
        return this.routePrefix;
    }

    public void setRoutePrefix(String routePrefix) {
      this.routePrefix = routePrefix;
    }
    
    public LabelSelector getRuleSelector() {
        return this.ruleSelector;
    }

    public void setRuleSelector(LabelSelector ruleSelector) {
      this.ruleSelector = ruleSelector;
    }
    
    public Rules getRules() {
        return this.rules;
    }

    public void setRules(Rules rules) {
      this.rules = rules;
    }
    
    public String getScrapeInterval() {
        return this.scrapeInterval;
    }

    public void setScrapeInterval(String scrapeInterval) {
      this.scrapeInterval = scrapeInterval;
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
    
    public LabelSelector getServiceMonitorSelector() {
        return this.serviceMonitorSelector;
    }

    public void setServiceMonitorSelector(LabelSelector serviceMonitorSelector) {
      this.serviceMonitorSelector = serviceMonitorSelector;
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
    
    public List<Volume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<Volume> volumes) {
      this.volumes = volumes;
    }
    
    public Boolean getWalCompression() {
        return this.walCompression;
    }

    public void setWalCompression(Boolean walCompression) {
      this.walCompression = walCompression;
    }
    
}
