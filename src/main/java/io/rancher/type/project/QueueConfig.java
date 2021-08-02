package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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
}
