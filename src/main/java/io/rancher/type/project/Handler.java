package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Handler extends AbstractType {

    @JsonProperty("command")
    private List<String> command;

    @JsonProperty("host")
    private String host;

    @JsonProperty("httpHeaders")
    private List<HttpHeader> httpHeaders;

    @JsonProperty("path")
    private String path;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("scheme")
    private String scheme;

    @JsonProperty("tcp")
    private Boolean tcp;
}
