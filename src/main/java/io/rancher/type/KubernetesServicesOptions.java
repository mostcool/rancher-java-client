package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class KubernetesServicesOptions extends AbstractType {

    @JsonProperty("etcd")
    private Map<String, Object> etcd;

    @JsonProperty("kubeController")
    private Map<String, Object> kubeController;

    @JsonProperty("kubeapi")
    private Map<String, Object> kubeapi;

    @JsonProperty("kubelet")
    private Map<String, Object> kubelet;

    @JsonProperty("kubeproxy")
    private Map<String, Object> kubeproxy;

    @JsonProperty("scheduler")
    private Map<String, Object> scheduler;
}
