package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class MultiClusterApp extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("answers")
    private List<Answer> answers;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("members")
    private List<Member> members;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;

    /**
     * required true
     */
    @JsonProperty("roles")
    private List<String> roles;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private MultiClusterAppStatus status;

    /**
     * required true
     */
    @JsonProperty("targets")
    private List<Target> targets;

    /**
     * required true
     */
    @JsonProperty("templateVersionId")
    private String templateVersionId;

    @JsonProperty("timeout")
    private Integer timeout;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("upgradeStrategy")
    private UpgradeStrategy upgradeStrategy;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("wait")
    private Boolean wait;
}
