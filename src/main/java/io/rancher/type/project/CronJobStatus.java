package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class CronJobStatus extends AbstractType {

    @JsonProperty("active")
    private List<ObjectReference> active;

    @JsonProperty("lastScheduleTime")
    private String lastScheduleTime;
}
