package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TcpSettings extends AbstractType {

    @JsonProperty("connectTimeout")
    private String connectTimeout;

    @JsonProperty("maxConnections")
    private Integer maxConnections;
}
