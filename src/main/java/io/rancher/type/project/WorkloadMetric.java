package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WorkloadMetric extends AbstractType {

    @JsonProperty("path")
    private String path;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("schema")
    private String schema;
}
