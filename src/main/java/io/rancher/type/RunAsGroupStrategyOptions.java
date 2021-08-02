package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RunAsGroupStrategyOptions extends AbstractType {

    @JsonProperty("ranges")
    private List<IdRange> ranges;

    @JsonProperty("rule")
    private String rule;
}
