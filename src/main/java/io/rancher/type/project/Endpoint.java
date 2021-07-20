package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

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
    
    public SecretKeySelector getBearerTokenSecret() {
        return this.bearerTokenSecret;
    }

    public void setBearerTokenSecret(SecretKeySelector bearerTokenSecret) {
      this.bearerTokenSecret = bearerTokenSecret;
    }
    
    public Boolean getHonorTimestamps() {
        return this.honorTimestamps;
    }

    public void setHonorTimestamps(Boolean honorTimestamps) {
      this.honorTimestamps = honorTimestamps;
    }
    
    public String getInterval() {
        return this.interval;
    }

    public void setInterval(String interval) {
      this.interval = interval;
    }
    
    public Map<String, Object> getParams() {
        return this.params;
    }

    public void setParams(Map<String, Object> params) {
      this.params = params;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public List<RelabelConfig> getRelabelings() {
        return this.relabelings;
    }

    public void setRelabelings(List<RelabelConfig> relabelings) {
      this.relabelings = relabelings;
    }
    
    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
      this.scheme = scheme;
    }
    
    public String getScrapeTimeout() {
        return this.scrapeTimeout;
    }

    public void setScrapeTimeout(String scrapeTimeout) {
      this.scrapeTimeout = scrapeTimeout;
    }
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
}
