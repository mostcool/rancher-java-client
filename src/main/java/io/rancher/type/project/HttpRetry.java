package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HttpRetry extends AbstractType {

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("perTryTimeout")
    private String perTryTimeout;
}
