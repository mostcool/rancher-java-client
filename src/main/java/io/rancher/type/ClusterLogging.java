package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterLogging extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("appliedSpec")
    private ClusterLoggingSpec appliedSpec;

    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("conditions")
    private List<LoggingCondition> conditions;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("customTargetConfig")
    private CustomTargetConfig customTargetConfig;

    @JsonProperty("elasticsearchConfig")
    private ElasticsearchConfig elasticsearchConfig;

    @JsonProperty("enableJSONParsing")
    private Boolean enableJsonparsing;

    @JsonProperty("failedSpec")
    private ClusterLoggingSpec failedSpec;

    @JsonProperty("fluentForwarderConfig")
    private FluentForwarderConfig fluentForwarderConfig;

    @JsonProperty("includeSystemComponent")
    private Boolean includeSystemComponent;

    @JsonProperty("kafkaConfig")
    private KafkaConfig kafkaConfig;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("outputFlushInterval")
    private Integer outputFlushInterval;

    @JsonProperty("outputTags")
    private Map<String, Object> outputTags;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("splunkConfig")
    private SplunkConfig splunkConfig;

    @JsonProperty("state")
    private String state;

    @JsonProperty("syslogConfig")
    private SyslogConfig syslogConfig;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;
}
