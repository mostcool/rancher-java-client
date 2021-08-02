package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TopologySpreadConstraint extends AbstractType {

    @JsonProperty("labelSelector")
    private LabelSelector labelSelector;

    @JsonProperty("maxSkew")
    private Integer maxSkew;

    @JsonProperty("topologyKey")
    private String topologyKey;

    @JsonProperty("whenUnsatisfiable")
    private String whenUnsatisfiable;
}
