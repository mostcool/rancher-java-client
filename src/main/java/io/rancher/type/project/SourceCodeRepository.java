package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class SourceCodeRepository extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("defaultBranch")
    private String defaultBranch;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("language")
    private String language;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("permissions")
    private RepoPerm permissions;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("sourceCodeCredentialId")
    private String sourceCodeCredentialId;

    /**
     * required true
     */
    @JsonProperty("sourceCodeType")
    private String sourceCodeType;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private SourceCodeRepositoryStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("url")
    private String url;

    /**
     * required true
     */
    @JsonProperty("userId")
    private String userId;

    @JsonProperty("uuid")
    private String uuid;
}
