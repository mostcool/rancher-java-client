package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InjectDelay extends AbstractType {

    @JsonProperty("exponentialDelay")
    private String exponentialDelay;

    @JsonProperty("fixedDelay")
    private String fixedDelay;

    @JsonProperty("percent")
    private Integer percent;
}
