package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Pipeline extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("lastExecutionId")
    private String lastExecutionId;

    @JsonProperty("lastRunState")
    private String lastRunState;

    @JsonProperty("lastStarted")
    private String lastStarted;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("nextRun")
    private Integer nextRun;

    @JsonProperty("nextStart")
    private String nextStart;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("pipelineState")
    private String pipelineState;

    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("repositoryUrl")
    private String repositoryUrl;

    @JsonProperty("sourceCodeCredential")
    private SourceCodeCredential sourceCodeCredential;

    @JsonProperty("sourceCodeCredentialId")
    private String sourceCodeCredentialId;

    @JsonProperty("state")
    private String state;

    @JsonProperty("token")
    private String token;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("triggerWebhookPr")
    private Boolean triggerWebhookPr;

    @JsonProperty("triggerWebhookPush")
    private Boolean triggerWebhookPush;

    @JsonProperty("triggerWebhookTag")
    private Boolean triggerWebhookTag;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("webhookId")
    private String webhookId;
}
