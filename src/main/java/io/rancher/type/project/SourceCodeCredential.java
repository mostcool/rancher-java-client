package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class SourceCodeCredential extends AbstractType {

    @JsonProperty("accessToken")
    private String accessToken;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("avatarUrl")
    private String avatarUrl;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    /**
     * required true
     */
    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("gitCloneToken")
    private String gitCloneToken;

    @JsonProperty("gitLoginName")
    private String gitLoginName;

    @JsonProperty("htmlUrl")
    private String htmlUrl;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("loginName")
    private String loginName;

    @JsonProperty("logout")
    private Boolean logout;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("refreshToken")
    private String refreshToken;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("sourceCodeType")
    private String sourceCodeType;

    @JsonProperty("state")
    private String state;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    /**
     * required true
     */
    @JsonProperty("userId")
    private String userId;

    @JsonProperty("uuid")
    private String uuid;
}
