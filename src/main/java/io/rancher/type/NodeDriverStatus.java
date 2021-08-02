package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class NodeDriverStatus extends AbstractType {

    @JsonProperty("appliedChecksum")
    private String appliedChecksum;

    @JsonProperty("appliedDockerMachineVersion")
    private String appliedDockerMachineVersion;

    @JsonProperty("appliedURL")
    private String appliedUrl;

    @JsonProperty("conditions")
    private List<Condition> conditions;
}
