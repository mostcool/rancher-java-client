package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class FluentForwarderConfig extends AbstractType {

    @JsonProperty("certificate")
    private String certificate;

    @JsonProperty("clientCert")
    private String clientCert;

    @JsonProperty("clientKey")
    private String clientKey;

    @JsonProperty("clientKeyPass")
    private String clientKeyPass;

    @JsonProperty("compress")
    private Boolean compress;

    @JsonProperty("enableTls")
    private Boolean enableTls;

    /**
     * required true
     */
    @JsonProperty("fluentServers")
    private List<FluentServer> fluentServers;

    @JsonProperty("sslVerify")
    private Boolean sslVerify;
}
