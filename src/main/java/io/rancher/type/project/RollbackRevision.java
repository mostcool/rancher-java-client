package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RollbackRevision extends AbstractType {

    @JsonProperty("forceUpgrade")
    private Boolean forceUpgrade;

    @JsonProperty("revisionId")
    private String revisionId;
}
