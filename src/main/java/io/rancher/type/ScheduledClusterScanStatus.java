package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ScheduledClusterScanStatus extends AbstractType {

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("lastRunTimestamp")
    private String lastRunTimestamp;
}
