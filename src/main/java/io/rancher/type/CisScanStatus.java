package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CisScanStatus extends AbstractType {

    @JsonProperty("fail")
    private Integer fail;

    @JsonProperty("notApplicable")
    private Integer notApplicable;

    @JsonProperty("pass")
    private Integer pass;

    @JsonProperty("skip")
    private Integer skip;

    @JsonProperty("total")
    private Integer total;
}
