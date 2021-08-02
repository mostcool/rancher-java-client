package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MetricRule extends AbstractType {

    @JsonProperty("comparison")
    private String comparison;

    @JsonProperty("description")
    private String description;

    /**
     * required true
     */
    @JsonProperty("duration")
    private String duration;

    /**
     * required true
     */
    @JsonProperty("expression")
    private String expression;

    @JsonProperty("thresholdValue")
    private Float thresholdValue;
}
