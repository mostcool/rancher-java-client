package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class Nodelocal extends AbstractType {

    @JsonProperty("ipAddress")
    private String ipAddress;

    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;

    @JsonProperty("updateStrategy")
    private DaemonSetUpdateStrategy updateStrategy;
}
