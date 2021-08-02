package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class AuditLogConfig extends AbstractType {

    @JsonProperty("format")
    private String format;

    @JsonProperty("maxAge")
    private Integer maxAge;

    @JsonProperty("maxBackup")
    private Integer maxBackup;

    @JsonProperty("maxSize")
    private Integer maxSize;

    @JsonProperty("path")
    private String path;

    @JsonProperty("policy")
    private Map<String, Object> policy;
}
