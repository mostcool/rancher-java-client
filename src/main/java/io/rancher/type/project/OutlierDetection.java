package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OutlierDetection extends AbstractType {

    @JsonProperty("baseEjectionTime")
    private String baseEjectionTime;

    @JsonProperty("consecutiveErrors")
    private Integer consecutiveErrors;

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("maxEjectionPercent")
    private Integer maxEjectionPercent;
}
