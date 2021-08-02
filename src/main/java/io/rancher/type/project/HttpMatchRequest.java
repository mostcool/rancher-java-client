package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class HttpMatchRequest extends AbstractType {

    @JsonProperty("authority")
    private StringMatch authority;

    @JsonProperty("gateways")
    private List<String> gateways;

    @JsonProperty("headers")
    private Map<String, Object> headers;

    @JsonProperty("method")
    private StringMatch method;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("scheme")
    private StringMatch scheme;

    @JsonProperty("sourceLabels")
    private Map<String, Object> sourceLabels;

    @JsonProperty("uri")
    private StringMatch uri;
}
