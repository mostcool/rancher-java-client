package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class CronJobConfig extends AbstractType {

    @JsonProperty("concurrencyPolicy")
    private String concurrencyPolicy;

    @JsonProperty("failedJobsHistoryLimit")
    private Integer failedJobsHistoryLimit;

    @JsonProperty("jobAnnotations")
    private Map<String, Object> jobAnnotations;

    @JsonProperty("jobConfig")
    private JobConfig jobConfig;

    @JsonProperty("jobLabels")
    private Map<String, Object> jobLabels;

    @JsonProperty("schedule")
    private String schedule;

    @JsonProperty("startingDeadlineSeconds")
    private Integer startingDeadlineSeconds;

    @JsonProperty("successfulJobsHistoryLimit")
    private Integer successfulJobsHistoryLimit;

    @JsonProperty("suspend")
    private Boolean suspend;
}
