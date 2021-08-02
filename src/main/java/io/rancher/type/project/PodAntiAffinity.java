package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PodAntiAffinity extends AbstractType {

    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;

    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;
}
