package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AlertmanagerEndpoints extends AbstractType {

    @JsonProperty("apiVersion")
    private String apiVersion;

    @JsonProperty("bearerTokenFile")
    private String bearerTokenFile;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("pathPrefix")
    private String pathPrefix;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("scheme")
    private String scheme;

    @JsonProperty("tlsConfig")
    private TlsConfig tlsConfig;
}
