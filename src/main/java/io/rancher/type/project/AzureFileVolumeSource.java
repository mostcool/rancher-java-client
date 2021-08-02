package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AzureFileVolumeSource extends AbstractType {

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretName")
    private String secretName;

    @JsonProperty("shareName")
    private String shareName;
}
