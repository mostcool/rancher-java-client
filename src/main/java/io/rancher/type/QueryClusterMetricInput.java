package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class QueryClusterMetricInput extends AbstractType {

    @JsonProperty("clusterId")
    private String clusterId;

    /**
     * required true
     */
    @JsonProperty("expr")
    private Integer exprFlag;

    @JsonProperty("from")
    private String from;

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("to")
    private String to;
}
