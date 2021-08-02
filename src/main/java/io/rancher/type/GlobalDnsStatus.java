package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GlobalDnsStatus extends AbstractType {

    @JsonProperty("clusterEndpoints")
    private Map<String, Object> clusterEndpoints;

    @JsonProperty("endpoints")
    private List<String> endpoints;
}
