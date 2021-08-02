package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WeightedPodAffinityTerm extends AbstractType {

    @JsonProperty("podAffinityTerm")
    private PodAffinityTerm podAffinityTerm;

    @JsonProperty("weight")
    private Integer weight;
}
