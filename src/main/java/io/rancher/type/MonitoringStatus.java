package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class MonitoringStatus extends AbstractType {

    @JsonProperty("conditions")
    private List<MonitoringCondition> conditions;

    @JsonProperty("grafanaEndpoint")
    private String grafanaEndpoint;
}
