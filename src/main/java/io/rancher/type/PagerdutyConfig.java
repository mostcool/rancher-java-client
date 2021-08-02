package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PagerdutyConfig extends AbstractType {

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    /**
     * required true
     */
    @JsonProperty("serviceKey")
    private String serviceKey;
}
