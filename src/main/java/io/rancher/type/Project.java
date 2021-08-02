package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Project extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("conditions")
    private List<ProjectCondition> conditions;

    @JsonProperty("containerDefaultResourceLimit")
    private ContainerResourceLimit containerDefaultResourceLimit;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enableProjectMonitoring")
    private Boolean enableProjectMonitoring;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("monitoringStatus")
    private MonitoringStatus monitoringStatus;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceDefaultResourceQuota")
    private NamespaceResourceQuota namespaceDefaultResourceQuota;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("podSecurityPolicyTemplateId")
    private String podSecurityPolicyTemplateId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("resourceQuota")
    private ProjectResourceQuota resourceQuota;

    @JsonProperty("state")
    private String state;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;
}
