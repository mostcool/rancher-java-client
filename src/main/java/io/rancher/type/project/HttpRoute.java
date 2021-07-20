package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

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
    
    public Map<String, Object> getAppendHeaders() {
        return this.appendHeaders;
    }

    public void setAppendHeaders(Map<String, Object> appendHeaders) {
      this.appendHeaders = appendHeaders;
    }
    
    public CorsPolicy getCorsPolicy() {
        return this.corsPolicy;
    }

    public void setCorsPolicy(CorsPolicy corsPolicy) {
      this.corsPolicy = corsPolicy;
    }
    
    public HttpFaultInjection getFault() {
        return this.fault;
    }

    public void setFault(HttpFaultInjection fault) {
      this.fault = fault;
    }
    
    public Headers getHeaders() {
        return this.headers;
    }

    public void setHeaders(Headers headers) {
      this.headers = headers;
    }
    
    public List<HttpMatchRequest> getMatch() {
        return this.match;
    }

    public void setMatch(List<HttpMatchRequest> match) {
      this.match = match;
    }
    
    public Destination getMirror() {
        return this.mirror;
    }

    public void setMirror(Destination mirror) {
      this.mirror = mirror;
    }
    
    public HttpRedirect getRedirect() {
        return this.redirect;
    }

    public void setRedirect(HttpRedirect redirect) {
      this.redirect = redirect;
    }
    
    public Map<String, Object> getRemoveResponseHeaders() {
        return this.removeResponseHeaders;
    }

    public void setRemoveResponseHeaders(Map<String, Object> removeResponseHeaders) {
      this.removeResponseHeaders = removeResponseHeaders;
    }
    
    public HttpRetry getRetries() {
        return this.retries;
    }

    public void setRetries(HttpRetry retries) {
      this.retries = retries;
    }
    
    public HttpRewrite getRewrite() {
        return this.rewrite;
    }

    public void setRewrite(HttpRewrite rewrite) {
      this.rewrite = rewrite;
    }
    
    public List<HttpRouteDestination> getRoute() {
        return this.route;
    }

    public void setRoute(List<HttpRouteDestination> route) {
      this.route = route;
    }
    
    public String getTimeout() {
        return this.timeout;
    }

    public void setTimeout(String timeout) {
      this.timeout = timeout;
    }
    
    public Boolean getWebsocketUpgrade() {
        return this.websocketUpgrade;
    }

    public void setWebsocketUpgrade(Boolean websocketUpgrade) {
      this.websocketUpgrade = websocketUpgrade;
    }
    
}
