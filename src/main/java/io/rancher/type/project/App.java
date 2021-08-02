package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class App extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("answers")
    private Map<String, Object> answers;

    @JsonProperty("appRevisionId")
    private String appRevisionId;

    @JsonProperty("appliedFiles")
    private Map<String, Object> appliedFiles;

    @JsonProperty("conditions")
    private List<AppCondition> conditions;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("files")
    private Map<String, Object> files;

    @JsonProperty("helmVersion")
    private String helmVersion;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("lastAppliedTemplate")
    private String lastAppliedTemplate;

    @JsonProperty("multiClusterAppId")
    private String multiClusterAppId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("notes")
    private String notes;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("prune")
    private Boolean prune;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("targetNamespace")
    private String targetNamespace;

    @JsonProperty("timeout")
    private Integer timeout;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("valuesYaml")
    private String valuesYaml;

    @JsonProperty("wait")
    private Boolean wait;
}
