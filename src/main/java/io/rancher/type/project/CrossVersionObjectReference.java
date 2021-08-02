package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CrossVersionObjectReference extends AbstractType {

    @JsonProperty("apiVersion")
    private String apiVersion;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("name")
    private String name;
}
