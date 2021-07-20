package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class BackupConfig extends AbstractType {
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("intervalHours")
    private Integer intervalHours;
    
    @JsonProperty("retention")
    private Integer retention;
    
    @JsonProperty("s3BackupConfig")
    private S3BackupConfig s3backupConfig;
    
    @JsonProperty("safeTimestamp")
    private Boolean safeTimestamp;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Integer getIntervalHours() {
        return this.intervalHours;
    }

    public void setIntervalHours(Integer intervalHours) {
      this.intervalHours = intervalHours;
    }
    
    public Integer getRetention() {
        return this.retention;
    }

    public void setRetention(Integer retention) {
      this.retention = retention;
    }
    
    public S3BackupConfig getS3backupConfig() {
        return this.s3backupConfig;
    }

    public void setS3backupConfig(S3BackupConfig s3backupConfig) {
      this.s3backupConfig = s3backupConfig;
    }
    
    public Boolean getSafeTimestamp() {
        return this.safeTimestamp;
    }

    public void setSafeTimestamp(Boolean safeTimestamp) {
      this.safeTimestamp = safeTimestamp;
    }
    
}
