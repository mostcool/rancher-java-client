package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class EtcdBackupStatus extends AbstractType {

    @JsonProperty("clusterObject")
    private String clusterObject;

    @JsonProperty("conditions")
    private List<EtcdBackupCondition> conditions;

    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;
}
