package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WechatConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("agent")
    private String agent;

    @JsonProperty("apiUrl")
    private String apiUrl;

    /**
     * required true
     */
    @JsonProperty("corp")
    private String corp;

    /**
     * required true
     */
    @JsonProperty("defaultRecipient")
    private String defaultRecipient;

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    /**
     * required true
     */
    @JsonProperty("recipientType")
    private String recipientType;

    /**
     * required true
     */
    @JsonProperty("secret")
    private String secret;
}
