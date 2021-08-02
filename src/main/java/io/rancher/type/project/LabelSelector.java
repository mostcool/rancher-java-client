package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class LabelSelector extends AbstractType {

    @JsonProperty("matchExpressions")
    private List<LabelSelectorRequirement> matchExpressions;

    @JsonProperty("matchLabels")
    private Map<String, Object> matchLabels;
}
