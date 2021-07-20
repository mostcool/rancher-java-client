package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

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
    
    public StringMatch getAuthority() {
        return this.authority;
    }

    public void setAuthority(StringMatch authority) {
      this.authority = authority;
    }
    
    public List<String> getGateways() {
        return this.gateways;
    }

    public void setGateways(List<String> gateways) {
      this.gateways = gateways;
    }
    
    public Map<String, Object> getHeaders() {
        return this.headers;
    }

    public void setHeaders(Map<String, Object> headers) {
      this.headers = headers;
    }
    
    public StringMatch getMethod() {
        return this.method;
    }

    public void setMethod(StringMatch method) {
      this.method = method;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public StringMatch getScheme() {
        return this.scheme;
    }

    public void setScheme(StringMatch scheme) {
      this.scheme = scheme;
    }
    
    public Map<String, Object> getSourceLabels() {
        return this.sourceLabels;
    }

    public void setSourceLabels(Map<String, Object> sourceLabels) {
      this.sourceLabels = sourceLabels;
    }
    
    public StringMatch getUri() {
        return this.uri;
    }

    public void setUri(StringMatch uri) {
      this.uri = uri;
    }
    
}
