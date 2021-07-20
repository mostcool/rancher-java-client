package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class EtcdBackupStatus extends AbstractType {
    
    @JsonProperty("clusterObject")
    private String clusterObject;
    
    @JsonProperty("conditions")
    private List<EtcdBackupCondition> conditions;
    
    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;
    
    public String getClusterObject() {
        return this.clusterObject;
    }

    public void setClusterObject(String clusterObject) {
      this.clusterObject = clusterObject;
    }
    
    public List<EtcdBackupCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<EtcdBackupCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
}
