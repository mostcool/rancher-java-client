package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ApiService extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("caBundle")
    private String caBundle;

    @JsonProperty("conditions")
    private List<ApiServiceCondition> conditions;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("group")
    private String group;

    @JsonProperty("groupPriorityMinimum")
    private Integer groupPriorityMinimum;

    @JsonProperty("insecureSkipTLSVerify")
    private Boolean insecureSkipTlsverify;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("service")
    private ServiceReference service;

    @JsonProperty("state")
    private String state;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version")
    private String version;

    @JsonProperty("versionPriority")
    private Integer versionPriority;
}
