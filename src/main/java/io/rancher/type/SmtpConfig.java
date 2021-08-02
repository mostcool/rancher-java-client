package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SmtpConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("defaultRecipient")
    private String defaultRecipient;

    /**
     * required true
     */
    @JsonProperty("host")
    private String host;

    @JsonProperty("password")
    private String password;

    /**
     * required true
     */
    @JsonProperty("port")
    private Integer port;

    /**
     * required true
     */
    @JsonProperty("sender")
    private String sender;

    /**
     * required true
     */
    @JsonProperty("tls")
    private Boolean tls;

    @JsonProperty("username")
    private String username;
}
