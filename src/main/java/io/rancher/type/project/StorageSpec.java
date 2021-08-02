package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StorageSpec extends AbstractType {

    @JsonProperty("emptyDir")
    private EmptyDirVolumeSource emptyDir;

    @JsonProperty("volumeClaimTemplate")
    private PersistentVolumeClaim volumeClaimTemplate;
}
