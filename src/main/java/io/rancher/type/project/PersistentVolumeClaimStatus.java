package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class PersistentVolumeClaimStatus extends AbstractType {

    @JsonProperty("accessModes")
    private List<String> accessModes;

    @JsonProperty("capacity")
    private Map<String, Object> capacity;

    @JsonProperty("conditions")
    private List<PersistentVolumeClaimCondition> conditions;

    @JsonProperty("phase")
    private String phase;
}
