package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class NamespacedServiceAccountToken extends AbstractType {

    @JsonProperty("accountName")
    private String accountName;

    @JsonProperty("accountUid")
    private String accountUid;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("caCrt")
    private String caCrt;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("token")
    private String token;

    @JsonProperty("uuid")
    private String uuid;
}
