package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class QuerySpec extends AbstractType {

    @JsonProperty("lookbackDelta")
    private String lookbackDelta;

    @JsonProperty("maxConcurrency")
    private Integer maxConcurrency;

    @JsonProperty("maxSamples")
    private Integer maxSamples;

    @JsonProperty("timeout")
    private String timeout;
}
