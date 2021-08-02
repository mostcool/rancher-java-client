package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
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
}
