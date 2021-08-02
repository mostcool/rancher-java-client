package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AzureFilePersistentVolumeSource extends AbstractType {

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretName")
    private String secretName;

    @JsonProperty("secretNamespace")
    private String secretNamespace;

    @JsonProperty("shareName")
    private String shareName;
}
