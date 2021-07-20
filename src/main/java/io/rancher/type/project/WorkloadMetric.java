package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class WorkloadMetric extends AbstractType {
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("port")
    private Integer port;
    
    @JsonProperty("schema")
    private String schema;
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getSchema() {
        return this.schema;
    }

    public void setSchema(String schema) {
      this.schema = schema;
    }
    
}
