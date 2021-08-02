package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TargetPod extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("condition")
    private String condition;

    /**
     * required true
     */
    @JsonProperty("podId")
    private String podId;

    @JsonProperty("restartIntervalSeconds")
    private Integer restartIntervalSeconds;

    @JsonProperty("restartTimes")
    private Integer restartTimes;
}
