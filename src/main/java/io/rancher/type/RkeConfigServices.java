package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RkeConfigServices extends AbstractType {

    @JsonProperty("etcd")
    private EtcdService etcd;

    @JsonProperty("kubeApi")
    private KubeAPIService kubeApi;

    @JsonProperty("kubeController")
    private KubeControllerService kubeController;

    @JsonProperty("kubelet")
    private KubeletService kubelet;

    @JsonProperty("kubeproxy")
    private KubeproxyService kubeproxy;

    @JsonProperty("scheduler")
    private SchedulerService scheduler;
}
