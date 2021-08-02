package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
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
}
