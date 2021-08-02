package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LocalClusterAuthEndpoint extends AbstractType {

    @JsonProperty("caCerts")
    private String caCerts;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("fqdn")
    private String fqdn;
}
