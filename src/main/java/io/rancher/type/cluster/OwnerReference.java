package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OwnerReference extends AbstractType {

    @JsonProperty("apiVersion")
    private String apiVersion;

    @JsonProperty("blockOwnerDeletion")
    private Boolean blockOwnerDeletion;

    @JsonProperty("controller")
    private Boolean controller;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("name")
    private String name;

    @JsonProperty("uid")
    private String uid;
}
