package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RemoteWriteSpec extends AbstractType {

    @JsonProperty("basicAuth")
    private BasicAuth basicAuth;

    @JsonProperty("bearerToken")
    private String bearerToken;

    @JsonProperty("bearerTokenFile")
    private String bearerTokenFile;

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    @JsonProperty("queueConfig")
    private QueueConfig queueConfig;

    @JsonProperty("remoteTimeout")
    private String remoteTimeout;

    @JsonProperty("tlsConfig")
    private TlsConfig tlsConfig;

    @JsonProperty("url")
    private String url;

    @JsonProperty("writeRelabelConfigs")
    private List<RelabelConfig> writeRelabelConfigs;
}
