package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MetadataOpenstackOpts extends AbstractType {

    @JsonProperty("request-timeout")
    private Integer requestTimeout;

    @JsonProperty("search-order")
    private String searchOrder;
}
