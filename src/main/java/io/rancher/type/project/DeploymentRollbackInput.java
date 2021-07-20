package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DeploymentRollbackInput extends AbstractType {
    
    @JsonProperty("replicaSetId")
    private String replicaSetId;
    
    public String getReplicaSetId() {
        return this.replicaSetId;
    }

    public void setReplicaSetId(String replicaSetId) {
      this.replicaSetId = replicaSetId;
    }
    
}
