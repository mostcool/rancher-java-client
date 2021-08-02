package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class L4MatchAttributes extends AbstractType {

    @JsonProperty("destinationSubnets")
    private List<String> destinationSubnets;

    @JsonProperty("gateways")
    private List<String> gateways;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("sourceLabels")
    private Map<String, Object> sourceLabels;
}
