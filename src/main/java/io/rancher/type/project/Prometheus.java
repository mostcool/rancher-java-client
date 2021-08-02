package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
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
}
