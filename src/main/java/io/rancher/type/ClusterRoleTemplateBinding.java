package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterRoleTemplateBinding extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("groupId")
    private String groupId;

    @JsonProperty("groupPrincipalId")
    private String groupPrincipalId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("roleTemplateId")
    private String roleTemplateId;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("userPrincipalId")
    private String userPrincipalId;

    @JsonProperty("uuid")
    private String uuid;
}
