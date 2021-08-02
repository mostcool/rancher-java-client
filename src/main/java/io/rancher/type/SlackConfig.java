package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SlackConfig extends AbstractType {

    @JsonProperty("defaultRecipient")
    private String defaultRecipient;

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    /**
     * required true
     */
    @JsonProperty("url")
    private String url;
}
