package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DeploymentConfig extends AbstractType {

    @JsonProperty("maxSurge")
    private String maxSurge;

    @JsonProperty("maxUnavailable")
    private String maxUnavailable;

    @JsonProperty("minReadySeconds")
    private Integer minReadySeconds;

    @JsonProperty("progressDeadlineSeconds")
    private Integer progressDeadlineSeconds;

    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;

    @JsonProperty("strategy")
    private String strategy;
}
