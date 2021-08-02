package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Metric extends AbstractType {

    @JsonProperty("current")
    private MetricValueStatus current;

    @JsonProperty("describedObject")
    private CrossVersionObjectReference describedObject;

    @JsonProperty("name")
    private String name;

    @JsonProperty("selector")
    private LabelSelector selector;

    @JsonProperty("target")
    private MetricTarget target;

    @JsonProperty("type")
    private String type;
}
