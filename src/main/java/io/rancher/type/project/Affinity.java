package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Affinity extends AbstractType {

    @JsonProperty("nodeAffinity")
    private NodeAffinity nodeAffinity;

    @JsonProperty("podAffinity")
    private PodAffinity podAffinity;

    @JsonProperty("podAntiAffinity")
    private PodAntiAffinity podAntiAffinity;
}
