package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NodeDrainInput extends AbstractType {

    @JsonProperty("deleteLocalData")
    private Boolean deleteLocalData;

    @JsonProperty("force")
    private Boolean force;

    @JsonProperty("gracePeriod")
    private Integer gracePeriod;

    @JsonProperty("ignoreDaemonSets")
    private Boolean ignoreDaemonSets;

    @JsonProperty("timeout")
    private Integer timeout;
}
