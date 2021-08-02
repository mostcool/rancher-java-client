package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class CloudCredential extends AbstractType {

    @JsonProperty("amazonec2credentialConfig")
    private Amazonec2credentialconfig amazonec2credentialConfig;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("azurecredentialConfig")
    private Azurecredentialconfig azurecredentialConfig;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("digitaloceancredentialConfig")
    private Digitaloceancredentialconfig digitaloceancredentialConfig;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("linodecredentialConfig")
    private Linodecredentialconfig linodecredentialConfig;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vmwarevspherecredentialConfig")
    private Vmwarevspherecredentialconfig vmwarevspherecredentialConfig;
}
