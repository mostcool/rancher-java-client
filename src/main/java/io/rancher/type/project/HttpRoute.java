package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class HttpRoute extends AbstractType {

    @JsonProperty("appendHeaders")
    private Map<String, Object> appendHeaders;

    @JsonProperty("corsPolicy")
    private CorsPolicy corsPolicy;

    @JsonProperty("fault")
    private HttpFaultInjection fault;

    @JsonProperty("headers")
    private Headers headers;

    @JsonProperty("match")
    private List<HttpMatchRequest> match;

    @JsonProperty("mirror")
    private Destination mirror;

    @JsonProperty("redirect")
    private HttpRedirect redirect;

    @JsonProperty("removeResponseHeaders")
    private Map<String, Object> removeResponseHeaders;

    @JsonProperty("retries")
    private HttpRetry retries;

    @JsonProperty("rewrite")
    private HttpRewrite rewrite;

    @JsonProperty("route")
    private List<HttpRouteDestination> route;

    @JsonProperty("timeout")
    private String timeout;

    @JsonProperty("websocketUpgrade")
    private Boolean websocketUpgrade;
}
