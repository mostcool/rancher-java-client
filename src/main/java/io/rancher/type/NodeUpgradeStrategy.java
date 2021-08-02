package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NodeUpgradeStrategy extends AbstractType {

    @JsonProperty("drain")
    private Boolean drain;

    @JsonProperty("maxUnavailableControlplane")
    private String maxUnavailableControlplane;

    @JsonProperty("maxUnavailableWorker")
    private String maxUnavailableWorker;

    @JsonProperty("nodeDrainInput")
    private NodeDrainInput nodeDrainInput;
}
