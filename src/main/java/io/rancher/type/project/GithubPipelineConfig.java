package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GithubPipelineConfig extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("clientSecret")
    private String clientSecret;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("inherit")
    private Boolean inherit;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("tls")
    private Boolean tls;

    @JsonProperty("type")
    private String type;

    @JsonProperty("uuid")
    private String uuid;
}
