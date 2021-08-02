package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ScheduledClusterScanConfig extends AbstractType {

    @JsonProperty("cronSchedule")
    private String cronSchedule;

    @JsonProperty("retention")
    private Integer retention;
}
