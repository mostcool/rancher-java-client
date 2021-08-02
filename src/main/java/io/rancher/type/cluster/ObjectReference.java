package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ObjectReference extends AbstractType {

    @JsonProperty("apiVersion")
    private String apiVersion;

    @JsonProperty("fieldPath")
    private String fieldPath;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("resourceVersion")
    private String resourceVersion;

    @JsonProperty("uid")
    private String uid;
}
