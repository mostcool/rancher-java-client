package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Probe extends AbstractType {

    @JsonProperty("command")
    private List<String> command;

    @JsonProperty("failureThreshold")
    private Integer failureThreshold;

    @JsonProperty("host")
    private String host;

    @JsonProperty("httpHeaders")
    private List<HttpHeader> httpHeaders;

    @JsonProperty("initialDelaySeconds")
    private Integer initialDelaySeconds;

    @JsonProperty("path")
    private String path;

    @JsonProperty("periodSeconds")
    private Integer periodSeconds;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("scheme")
    private String scheme;

    @JsonProperty("successThreshold")
    private Integer successThreshold;

    @JsonProperty("tcp")
    private Boolean tcp;

    @JsonProperty("timeoutSeconds")
    private Integer timeoutSeconds;
}
