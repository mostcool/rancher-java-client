package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BlockStorageOpenstackOpts extends AbstractType {

    @JsonProperty("bs-version")
    private String bsVersion;

    @JsonProperty("ignore-volume-az")
    private Boolean ignoreVolumeAz;

    @JsonProperty("trust-device-path")
    private Boolean trustDevicePath;
}
