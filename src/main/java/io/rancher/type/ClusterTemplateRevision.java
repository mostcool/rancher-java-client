package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterTemplateRevision extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    /**
     * required true
     */
    @JsonProperty("clusterConfig")
    private ClusterSpecBase clusterConfig;

    /**
     * required true
     */
    @JsonProperty("clusterTemplateId")
    private String clusterTemplateId;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("questions")
    private List<Question> questions;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("uuid")
    private String uuid;
}
