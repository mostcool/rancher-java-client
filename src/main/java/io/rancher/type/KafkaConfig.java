package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class KafkaConfig extends AbstractType {

    @JsonProperty("brokerEndpoints")
    private List<String> brokerEndpoints;

    @JsonProperty("certificate")
    private String certificate;

    @JsonProperty("clientCert")
    private String clientCert;

    @JsonProperty("clientKey")
    private String clientKey;

    @JsonProperty("saslPassword")
    private String saslPassword;

    @JsonProperty("saslScramMechanism")
    private String saslScramMechanism;

    @JsonProperty("saslType")
    private String saslType;

    @JsonProperty("saslUsername")
    private String saslUsername;

    /**
     * required true
     */
    @JsonProperty("topic")
    private String topic;

    @JsonProperty("zookeeperEndpoint")
    private String zookeeperEndpoint;
}
