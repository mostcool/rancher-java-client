package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class RemoteReadSpec extends AbstractType {

    @JsonProperty("basicAuth")
    private BasicAuth basicAuth;

    @JsonProperty("bearerToken")
    private String bearerToken;

    @JsonProperty("bearerTokenFile")
    private String bearerTokenFile;

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    @JsonProperty("readRecent")
    private Boolean readRecent;

    @JsonProperty("remoteTimeout")
    private String remoteTimeout;

    @JsonProperty("requiredMatchers")
    private Map<String, Object> requiredMatchers;

    @JsonProperty("tlsConfig")
    private TlsConfig tlsConfig;

    @JsonProperty("url")
    private String url;
}
