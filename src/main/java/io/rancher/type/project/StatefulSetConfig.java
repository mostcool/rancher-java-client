package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class StatefulSetConfig extends AbstractType {

    @JsonProperty("partition")
    private Integer partition;

    @JsonProperty("podManagementPolicy")
    private String podManagementPolicy;

    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;

    @JsonProperty("serviceName")
    private String serviceName;

    @JsonProperty("strategy")
    private String strategy;

    @JsonProperty("volumeClaimTemplates")
    private List<PersistentVolumeClaim> volumeClaimTemplates;
}
