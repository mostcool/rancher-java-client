package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConsistentHashLB extends AbstractType {

    @JsonProperty("httpCookie")
    private HttpCookie httpCookie;

    @JsonProperty("httpHeaderName")
    private String httpHeaderName;

    @JsonProperty("minimumRingSize")
    private Integer minimumRingSize;

    @JsonProperty("useSourceIp")
    private Boolean useSourceIp;
}
