package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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
}
