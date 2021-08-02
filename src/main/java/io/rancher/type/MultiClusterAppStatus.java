package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class MultiClusterAppStatus extends AbstractType {

    @JsonProperty("conditions")
    private List<AppCondition> conditions;

    @JsonProperty("helmVersion")
    private String helmVersion;

    /**
     * required true
     */
    @JsonProperty("revisionId")
    private String revisionId;
}
