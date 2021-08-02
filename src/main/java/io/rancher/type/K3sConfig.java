package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class K3sConfig extends AbstractType {

    @JsonProperty("k3supgradeStrategy")
    private K3sUpgradeStrategy k3supgradeStrategy;

    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;
}
