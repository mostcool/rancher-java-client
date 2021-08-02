package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DaemonSetConfig extends AbstractType {

    @JsonProperty("maxUnavailable")
    private Integer maxUnavailable;

    @JsonProperty("minReadySeconds")
    private Integer minReadySeconds;

    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;

    @JsonProperty("strategy")
    private String strategy;
}
