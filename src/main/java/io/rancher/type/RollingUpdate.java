package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RollingUpdate extends AbstractType {

    @JsonProperty("batchSize")
    private Integer batchSize;

    @JsonProperty("interval")
    private Integer interval;
}
