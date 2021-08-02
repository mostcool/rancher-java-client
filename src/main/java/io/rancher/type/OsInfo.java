package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OsInfo extends AbstractType {

    @JsonProperty("dockerVersion")
    private String dockerVersion;

    @JsonProperty("kernelVersion")
    private String kernelVersion;

    @JsonProperty("operatingSystem")
    private String operatingSystem;
}
