package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SplunkConfig extends AbstractType {

    @JsonProperty("certificate")
    private String certificate;

    @JsonProperty("clientCert")
    private String clientCert;

    @JsonProperty("clientKey")
    private String clientKey;

    @JsonProperty("clientKeyPass")
    private String clientKeyPass;

    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("index")
    private String index;

    @JsonProperty("source")
    private String source;

    @JsonProperty("sslVerify")
    private Boolean sslVerify;

    /**
     * required true
     */
    @JsonProperty("token")
    private String token;
}
