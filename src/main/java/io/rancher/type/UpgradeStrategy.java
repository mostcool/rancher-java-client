package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UpgradeStrategy extends AbstractType {

    @JsonProperty("rollingUpdate")
    private RollingUpdate rollingUpdate;
}
