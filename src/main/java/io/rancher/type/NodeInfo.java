package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class NodeInfo extends AbstractType {
    
    @JsonProperty("cpu")
    private CpuInfo cpu;
    
    @JsonProperty("kubernetes")
    private KubernetesInfo kubernetes;
    
    @JsonProperty("memory")
    private MemoryInfo memory;
    
    @JsonProperty("os")
    private OsInfo os;
    
    public CpuInfo getCpu() {
        return this.cpu;
    }

    public void setCpu(CpuInfo cpu) {
      this.cpu = cpu;
    }
    
    public KubernetesInfo getKubernetes() {
        return this.kubernetes;
    }

    public void setKubernetes(KubernetesInfo kubernetes) {
      this.kubernetes = kubernetes;
    }
    
    public MemoryInfo getMemory() {
        return this.memory;
    }

    public void setMemory(MemoryInfo memory) {
      this.memory = memory;
    }
    
    public OsInfo getOs() {
        return this.os;
    }

    public void setOs(OsInfo os) {
      this.os = os;
    }
    
}
