package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RuleGroup extends AbstractType {

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("name")
    private String name;

    @JsonProperty("partial_response_strategy")
    private String partialResponseStrategy;

    @JsonProperty("rules")
    private List<Rule> rules;
}
