package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class QueryProjectMetricInput extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("expr")
    private Integer exprFlag;

    @JsonProperty("from")
    private String from;

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("to")
    private String to;
}
