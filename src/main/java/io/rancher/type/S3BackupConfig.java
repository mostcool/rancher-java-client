package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class S3BackupConfig extends AbstractType {

    @JsonProperty("accessKey")
    private String accessKey;

    @JsonProperty("bucketName")
    private String bucketName;

    @JsonProperty("customCa")
    private String customCa;

    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("folder")
    private String folder;

    @JsonProperty("region")
    private String region;

    @JsonProperty("secretKey")
    private String secretKey;
}
