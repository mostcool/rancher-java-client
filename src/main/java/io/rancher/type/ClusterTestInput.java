package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterTestInput extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("customTargetConfig")
    private CustomTargetConfig customTargetConfig;

    @JsonProperty("elasticsearchConfig")
    private ElasticsearchConfig elasticsearchConfig;

    @JsonProperty("fluentForwarderConfig")
    private FluentForwarderConfig fluentForwarderConfig;

    @JsonProperty("kafkaConfig")
    private KafkaConfig kafkaConfig;

    @JsonProperty("outputTags")
    private Map<String, Object> outputTags;

    @JsonProperty("splunkConfig")
    private SplunkConfig splunkConfig;

    @JsonProperty("syslogConfig")
    private SyslogConfig syslogConfig;
}
