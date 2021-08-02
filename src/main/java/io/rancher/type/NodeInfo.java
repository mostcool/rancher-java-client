package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NodeInfo extends AbstractType {

    @JsonProperty("cpu")
    private CpuInfo cpu;

    @JsonProperty("kubernetes")
    private KubernetesInfo kubernetes;

    @JsonProperty("memory")
    private MemoryInfo memory;

    @JsonProperty("os")
    private OsInfo os;
}
