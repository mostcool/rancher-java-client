package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class QueryGraphInput extends AbstractType {

    @JsonProperty("filters")
    private Map<String, Object> filters;

    @JsonProperty("from")
    private String from;

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("isDetails")
    private Boolean isDetails;

    @JsonProperty("metricParams")
    private Map<String, Object> metricParams;

    @JsonProperty("to")
    private String to;
}
