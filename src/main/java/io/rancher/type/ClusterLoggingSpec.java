package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class ClusterLoggingSpec extends AbstractType {
    
    @JsonProperty("clusterId")
    private String clusterId;
    
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
    
    @JsonProperty("includeSystemComponent")
    private Boolean includeSystemComponent;
    
    @JsonProperty("kafkaConfig")
    private KafkaConfig kafkaConfig;
    
    @JsonProperty("outputFlushInterval")
    private Integer outputFlushInterval;
    
    @JsonProperty("outputTags")
    private Map<String, Object> outputTags;
    
    @JsonProperty("splunkConfig")
    private SplunkConfig splunkConfig;
    
    @JsonProperty("syslogConfig")
    private SyslogConfig syslogConfig;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
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
    
    public Boolean getIncludeSystemComponent() {
        return this.includeSystemComponent;
    }

    public void setIncludeSystemComponent(Boolean includeSystemComponent) {
      this.includeSystemComponent = includeSystemComponent;
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
