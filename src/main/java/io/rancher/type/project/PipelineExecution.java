package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class PipelineExecution extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("author")
    private String author;

    @JsonProperty("avatarUrl")
    private String avatarUrl;

    @JsonProperty("branch")
    private String branch;

    @JsonProperty("commit")
    private String commit;

    @JsonProperty("conditions")
    private List<PipelineCondition> conditions;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("ended")
    private String ended;

    @JsonProperty("event")
    private String event;

    @JsonProperty("executionState")
    private String executionState;

    @JsonProperty("htmlLink")
    private String htmlLink;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("message")
    private String message;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("pipelineConfig")
    private PipelineConfig pipelineConfig;

    /**
     * required true
     */
    @JsonProperty("pipelineId")
    private String pipelineId;

    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("repositoryUrl")
    private String repositoryUrl;

    /**
     * required true
     */
    @JsonProperty("run")
    private Integer run;

    @JsonProperty("stages")
    private List<StageStatus> stages;

    @JsonProperty("started")
    private String started;

    @JsonProperty("state")
    private String state;

    @JsonProperty("title")
    private String title;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("triggerUserId")
    private String triggerUserId;

    /**
     * required true
     */
    @JsonProperty("triggeredBy")
    private String triggeredBy;

    @JsonProperty("uuid")
    private String uuid;
}
