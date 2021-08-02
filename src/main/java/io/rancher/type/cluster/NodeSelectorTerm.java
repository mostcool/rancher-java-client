package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class NodeSelectorTerm extends AbstractType {

    @JsonProperty("matchExpressions")
    private List<NodeSelectorRequirement> matchExpressions;

    @JsonProperty("matchFields")
    private List<NodeSelectorRequirement> matchFields;
}
