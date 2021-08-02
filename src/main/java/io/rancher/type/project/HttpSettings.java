package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HttpSettings extends AbstractType {

    @JsonProperty("http1MaxPendingRequests")
    private Integer http1maxPendingRequests;

    @JsonProperty("http2MaxRequests")
    private Integer http2maxRequests;

    @JsonProperty("maxRequestsPerConnection")
    private Integer maxRequestsPerConnection;

    @JsonProperty("maxRetries")
    private Integer maxRetries;
}
