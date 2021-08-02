package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Endpoint extends AbstractType {

    @JsonProperty("bearerTokenSecret")
    private SecretKeySelector bearerTokenSecret;

    @JsonProperty("honorTimestamps")
    private Boolean honorTimestamps;

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("params")
    private Map<String, Object> params;

    @JsonProperty("path")
    private String path;

    @JsonProperty("relabelings")
    private List<RelabelConfig> relabelings;

    @JsonProperty("scheme")
    private String scheme;

    @JsonProperty("scrapeTimeout")
    private String scrapeTimeout;

    @JsonProperty("targetPort")
    private Integer targetPort;
}
