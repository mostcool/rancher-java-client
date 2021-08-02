package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class K3sUpgradeStrategy extends AbstractType {

    @JsonProperty("drainServerNodes")
    private Boolean drainServerNodes;

    @JsonProperty("drainWorkerNodes")
    private Boolean drainWorkerNodes;

    @JsonProperty("serverConcurrency")
    private Integer serverConcurrency;

    @JsonProperty("workerConcurrency")
    private Integer workerConcurrency;
}
