package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RestoreFromEtcdBackupInput extends AbstractType {
    
    @JsonProperty("etcdBackupId")
    private String etcdBackupId;
    
    @JsonProperty("restoreRkeConfig")
    private String restoreRkeConfig;
    
    public String getEtcdBackupId() {
        return this.etcdBackupId;
    }

    public void setEtcdBackupId(String etcdBackupId) {
      this.etcdBackupId = etcdBackupId;
    }
    
    public String getRestoreRkeConfig() {
        return this.restoreRkeConfig;
    }

    public void setRestoreRkeConfig(String restoreRkeConfig) {
      this.restoreRkeConfig = restoreRkeConfig;
    }
    
}
