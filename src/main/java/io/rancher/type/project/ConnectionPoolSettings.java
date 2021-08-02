package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConnectionPoolSettings extends AbstractType {

    @JsonProperty("http")
    private HttpSettings http;

    @JsonProperty("tcp")
    private TcpSettings tcp;
}
