package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

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
    
    public EtcdService getEtcd() {
        return this.etcd;
    }

    public void setEtcd(EtcdService etcd) {
      this.etcd = etcd;
    }
    
    public KubeAPIService getKubeApi() {
        return this.kubeApi;
    }

    public void setKubeApi(KubeAPIService kubeApi) {
      this.kubeApi = kubeApi;
    }
    
    public KubeControllerService getKubeController() {
        return this.kubeController;
    }

    public void setKubeController(KubeControllerService kubeController) {
      this.kubeController = kubeController;
    }
    
    public KubeletService getKubelet() {
        return this.kubelet;
    }

    public void setKubelet(KubeletService kubelet) {
      this.kubelet = kubelet;
    }
    
    public KubeproxyService getKubeproxy() {
        return this.kubeproxy;
    }

    public void setKubeproxy(KubeproxyService kubeproxy) {
      this.kubeproxy = kubeproxy;
    }
    
    public SchedulerService getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(SchedulerService scheduler) {
      this.scheduler = scheduler;
    }
    
}
