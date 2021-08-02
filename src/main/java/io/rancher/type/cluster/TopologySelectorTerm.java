package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TopologySelectorTerm extends AbstractType {

    @JsonProperty("matchLabelExpressions")
    private List<TopologySelectorLabelRequirement> matchLabelExpressions;
}
