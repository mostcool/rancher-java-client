package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class StatefulSetConfig extends AbstractType {
    
    @JsonProperty("partition")
    private Integer partition;
    
    @JsonProperty("podManagementPolicy")
    private String podManagementPolicy;
    
    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;
    
    @JsonProperty("serviceName")
    private String serviceName;
    
    @JsonProperty("strategy")
    private String strategy;
    
    @JsonProperty("volumeClaimTemplates")
    private List<PersistentVolumeClaim> volumeClaimTemplates;
    
    public Integer getPartition() {
        return this.partition;
    }

    public void setPartition(Integer partition) {
      this.partition = partition;
    }
    
    public String getPodManagementPolicy() {
        return this.podManagementPolicy;
    }

    public void setPodManagementPolicy(String podManagementPolicy) {
      this.podManagementPolicy = podManagementPolicy;
    }
    
    public Integer getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
      this.revisionHistoryLimit = revisionHistoryLimit;
    }
    
    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
    public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
        return this.volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
      this.volumeClaimTemplates = volumeClaimTemplates;
    }
    
}
