package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

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
    
    public String getConcurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    public void setConcurrencyPolicy(String concurrencyPolicy) {
      this.concurrencyPolicy = concurrencyPolicy;
    }
    
    public Integer getFailedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit;
    }

    public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
      this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    }
    
    public Map<String, Object> getJobAnnotations() {
        return this.jobAnnotations;
    }

    public void setJobAnnotations(Map<String, Object> jobAnnotations) {
      this.jobAnnotations = jobAnnotations;
    }
    
    public JobConfig getJobConfig() {
        return this.jobConfig;
    }

    public void setJobConfig(JobConfig jobConfig) {
      this.jobConfig = jobConfig;
    }
    
    public Map<String, Object> getJobLabels() {
        return this.jobLabels;
    }

    public void setJobLabels(Map<String, Object> jobLabels) {
      this.jobLabels = jobLabels;
    }
    
    public String getSchedule() {
        return this.schedule;
    }

    public void setSchedule(String schedule) {
      this.schedule = schedule;
    }
    
    public Integer getStartingDeadlineSeconds() {
        return this.startingDeadlineSeconds;
    }

    public void setStartingDeadlineSeconds(Integer startingDeadlineSeconds) {
      this.startingDeadlineSeconds = startingDeadlineSeconds;
    }
    
    public Integer getSuccessfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit;
    }

    public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
      this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    }
    
    public Boolean getSuspend() {
        return this.suspend;
    }

    public void setSuspend(Boolean suspend) {
      this.suspend = suspend;
    }
    
}
