package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SeLinuxStrategyOptions extends AbstractType {

    @JsonProperty("rule")
    private String rule;

    @JsonProperty("seLinuxOptions")
    private SeLinuxOptions seLinuxOptions;
}
