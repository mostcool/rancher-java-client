package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class TargetNode extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("condition")
    private String condition;

    @JsonProperty("cpuThreshold")
    private Integer cpuThreshold;

    @JsonProperty("memThreshold")
    private Integer memThreshold;

    @JsonProperty("nodeId")
    private String nodeId;

    @JsonProperty("selector")
    private Map<String, Object> selector;
}
