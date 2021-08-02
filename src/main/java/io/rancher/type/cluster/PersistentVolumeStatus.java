package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PersistentVolumeStatus extends AbstractType {

    @JsonProperty("message")
    private String message;

    @JsonProperty("phase")
    private String phase;

    @JsonProperty("reason")
    private String reason;
}
