package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DingtalkConfig extends AbstractType {

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    @JsonProperty("secret")
    private String secret;

    /**
     * required true
     */
    @JsonProperty("url")
    private String url;
}
