package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AzureDiskVolumeSource extends AbstractType {

    @JsonProperty("cachingMode")
    private String cachingMode;

    @JsonProperty("diskName")
    private String diskName;

    @JsonProperty("diskURI")
    private String diskUri;

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("readOnly")
    private Boolean readOnly;
}
