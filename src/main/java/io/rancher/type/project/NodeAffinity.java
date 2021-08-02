package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class NodeAffinity extends AbstractType {

    @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;

    @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;
}
