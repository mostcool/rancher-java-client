package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Server extends AbstractType {

    @JsonProperty("hosts")
    private List<String> hosts;

    @JsonProperty("port")
    private Port port;

    @JsonProperty("tls")
    private TlsOptions tls;
}
