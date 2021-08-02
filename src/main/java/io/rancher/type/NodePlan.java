package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NodePlan extends AbstractType {

    @JsonProperty("agentCheckInterval")
    private Integer agentCheckInterval;

    @JsonProperty("plan")
    private RkeConfigNodePlan plan;

    @JsonProperty("version")
    private Integer version;
}
