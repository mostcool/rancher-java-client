package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Destination extends AbstractType {

    @JsonProperty("host")
    private String host;

    @JsonProperty("port")
    private PortSelector port;

    @JsonProperty("subset")
    private String subset;
}
