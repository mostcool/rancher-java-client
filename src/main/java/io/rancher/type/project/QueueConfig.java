package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class QueueConfig extends AbstractType {
    
    @JsonProperty("batchSendDeadline")
    private String batchSendDeadline;
    
    @JsonProperty("capacity")
    private Integer capacity;
    
    @JsonProperty("maxBackoff")
    private String maxBackoff;
    
    @JsonProperty("maxRetries")
    private Integer maxRetries;
    
    @JsonProperty("maxSamplesPerSend")
    private Integer maxSamplesPerSend;
    
    @JsonProperty("maxShards")
    private Integer maxShards;
    
    @JsonProperty("minBackoff")
    private String minBackoff;
    
    @JsonProperty("minShards")
    private Integer minShards;
    
    public String getBatchSendDeadline() {
        return this.batchSendDeadline;
    }

    public void setBatchSendDeadline(String batchSendDeadline) {
      this.batchSendDeadline = batchSendDeadline;
    }
    
    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
      this.capacity = capacity;
    }
    
    public String getMaxBackoff() {
        return this.maxBackoff;
    }

    public void setMaxBackoff(String maxBackoff) {
      this.maxBackoff = maxBackoff;
    }
    
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
      this.maxRetries = maxRetries;
    }
    
    public Integer getMaxSamplesPerSend() {
        return this.maxSamplesPerSend;
    }

    public void setMaxSamplesPerSend(Integer maxSamplesPerSend) {
      this.maxSamplesPerSend = maxSamplesPerSend;
    }
    
    public Integer getMaxShards() {
        return this.maxShards;
    }

    public void setMaxShards(Integer maxShards) {
      this.maxShards = maxShards;
    }
    
    public String getMinBackoff() {
        return this.minBackoff;
    }

    public void setMinBackoff(String minBackoff) {
      this.minBackoff = minBackoff;
    }
    
    public Integer getMinShards() {
        return this.minShards;
    }

    public void setMinShards(Integer minShards) {
      this.minShards = minShards;
    }
    
}
