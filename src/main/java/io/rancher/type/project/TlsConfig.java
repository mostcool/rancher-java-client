package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TlsConfig extends AbstractType {

    @JsonProperty("ca")
    private SecretOrConfigMap ca;

    @JsonProperty("caFile")
    private String caFile;

    @JsonProperty("cert")
    private SecretOrConfigMap cert;

    @JsonProperty("certFile")
    private String certFile;

    @JsonProperty("insecureSkipVerify")
    private Boolean insecureSkipVerify;

    @JsonProperty("keyFile")
    private String keyFile;

    @JsonProperty("keySecret")
    private SecretKeySelector keySecret;

    @JsonProperty("serverName")
    private String serverName;
}
