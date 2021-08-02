package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MetricTarget extends AbstractType {

    @JsonProperty("averageValue")
    private String averageValue;

    @JsonProperty("type")
    private String type;

    @JsonProperty("utilization")
    private Integer utilization;

    @JsonProperty("value")
    private String value;
}
