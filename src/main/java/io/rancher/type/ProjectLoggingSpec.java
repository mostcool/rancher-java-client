package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class ProjectLoggingSpec extends AbstractType {
    
    @JsonProperty("customTargetConfig")
    private CustomTargetConfig customTargetConfig;
    
    @JsonProperty("displayName")
    private String displayName;
    
    @JsonProperty("elasticsearchConfig")
    private ElasticsearchConfig elasticsearchConfig;
    
    @JsonProperty("enableJSONParsing")
    private Boolean enableJsonparsing;
    
    @JsonProperty("fluentForwarderConfig")
    private FluentForwarderConfig fluentForwarderConfig;
    
    @JsonProperty("kafkaConfig")
    private KafkaConfig kafkaConfig;
    
    @JsonProperty("outputFlushInterval")
    private Integer outputFlushInterval;
    
    @JsonProperty("outputTags")
    private Map<String, Object> outputTags;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("splunkConfig")
    private SplunkConfig splunkConfig;
    
    @JsonProperty("syslogConfig")
    private SyslogConfig syslogConfig;
    
    public CustomTargetConfig getCustomTargetConfig() {
        return this.customTargetConfig;
    }

    public void setCustomTargetConfig(CustomTargetConfig customTargetConfig) {
      this.customTargetConfig = customTargetConfig;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public ElasticsearchConfig getElasticsearchConfig() {
        return this.elasticsearchConfig;
    }

    public void setElasticsearchConfig(ElasticsearchConfig elasticsearchConfig) {
      this.elasticsearchConfig = elasticsearchConfig;
    }
    
    public Boolean getEnableJsonparsing() {
        return this.enableJsonparsing;
    }

    public void setEnableJsonparsing(Boolean enableJsonparsing) {
      this.enableJsonparsing = enableJsonparsing;
    }
    
    public FluentForwarderConfig getFluentForwarderConfig() {
        return this.fluentForwarderConfig;
    }

    public void setFluentForwarderConfig(FluentForwarderConfig fluentForwarderConfig) {
      this.fluentForwarderConfig = fluentForwarderConfig;
    }
    
    public KafkaConfig getKafkaConfig() {
        return this.kafkaConfig;
    }

    public void setKafkaConfig(KafkaConfig kafkaConfig) {
      this.kafkaConfig = kafkaConfig;
    }
    
    public Integer getOutputFlushInterval() {
        return this.outputFlushInterval;
    }

    public void setOutputFlushInterval(Integer outputFlushInterval) {
      this.outputFlushInterval = outputFlushInterval;
    }
    
    public Map<String, Object> getOutputTags() {
        return this.outputTags;
    }

    public void setOutputTags(Map<String, Object> outputTags) {
      this.outputTags = outputTags;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public SplunkConfig getSplunkConfig() {
        return this.splunkConfig;
    }

    public void setSplunkConfig(SplunkConfig splunkConfig) {
      this.splunkConfig = splunkConfig;
    }
    
    public SyslogConfig getSyslogConfig() {
        return this.syslogConfig;
    }

    public void setSyslogConfig(SyslogConfig syslogConfig) {
      this.syslogConfig = syslogConfig;
    }
    
}
