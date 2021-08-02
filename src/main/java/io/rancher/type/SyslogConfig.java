package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SyslogConfig extends AbstractType {

    @JsonProperty("certificate")
    private String certificate;

    @JsonProperty("clientCert")
    private String clientCert;

    @JsonProperty("clientKey")
    private String clientKey;

    @JsonProperty("enableTls")
    private Boolean enableTls;

    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("program")
    private String program;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("sslVerify")
    private Boolean sslVerify;

    @JsonProperty("token")
    private String token;
}
