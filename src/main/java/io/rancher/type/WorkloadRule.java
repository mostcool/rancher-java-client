package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class WorkloadRule extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("availablePercentage")
    private Integer availablePercentage;

    @JsonProperty("selector")
    private Map<String, Object> selector;

    @JsonProperty("workloadId")
    private String workloadId;
}
