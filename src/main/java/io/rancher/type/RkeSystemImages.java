package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RkeSystemImages extends AbstractType {
    
    @JsonProperty("alpine")
    private String alpine;
    
    @JsonProperty("calicoCni")
    private String calicoCni;
    
    @JsonProperty("calicoControllers")
    private String calicoControllers;
    
    @JsonProperty("calicoCtl")
    private String calicoCtl;
    
    @JsonProperty("calicoFlexVol")
    private String calicoFlexVol;
    
    @JsonProperty("calicoNode")
    private String calicoNode;
    
    @JsonProperty("canalCni")
    private String canalCni;
    
    @JsonProperty("canalFlannel")
    private String canalFlannel;
    
    @JsonProperty("canalFlexVol")
    private String canalFlexVol;
    
    @JsonProperty("canalNode")
    private String canalNode;
    
    @JsonProperty("certDownloader")
    private String certDownloader;
    
    @JsonProperty("coredns")
    private String coredns;
    
    @JsonProperty("corednsAutoscaler")
    private String corednsAutoscaler;
    
    @JsonProperty("dnsmasq")
    private String dnsmasq;
    
    @JsonProperty("etcd")
    private String etcd;
    
    @JsonProperty("flannel")
    private String flannel;
    
    @JsonProperty("flannelCni")
    private String flannelCni;
    
    @JsonProperty("ingress")
    private String ingress;
    
    @JsonProperty("ingressBackend")
    private String ingressBackend;
    
    @JsonProperty("kubedns")
    private String kubedns;
    
    @JsonProperty("kubednsAutoscaler")
    private String kubednsAutoscaler;
    
    @JsonProperty("kubednsSidecar")
    private String kubednsSidecar;
    
    @JsonProperty("kubernetes")
    private String kubernetes;
    
    @JsonProperty("kubernetesServicesSidecar")
    private String kubernetesServicesSidecar;
    
    @JsonProperty("metricsServer")
    private String metricsServer;
    
    @JsonProperty("nginxProxy")
    private String nginxProxy;
    
    @JsonProperty("nodelocal")
    private String nodelocal;
    
    @JsonProperty("podInfraContainer")
    private String podInfraContainer;
    
    @JsonProperty("weaveCni")
    private String weaveCni;
    
    @JsonProperty("weaveNode")
    private String weaveNode;
    
    @JsonProperty("windowsPodInfraContainer")
    private String windowsPodInfraContainer;
    
    public String getAlpine() {
        return this.alpine;
    }

    public void setAlpine(String alpine) {
      this.alpine = alpine;
    }
    
    public String getCalicoCni() {
        return this.calicoCni;
    }

    public void setCalicoCni(String calicoCni) {
      this.calicoCni = calicoCni;
    }
    
    public String getCalicoControllers() {
        return this.calicoControllers;
    }

    public void setCalicoControllers(String calicoControllers) {
      this.calicoControllers = calicoControllers;
    }
    
    public String getCalicoCtl() {
        return this.calicoCtl;
    }

    public void setCalicoCtl(String calicoCtl) {
      this.calicoCtl = calicoCtl;
    }
    
    public String getCalicoFlexVol() {
        return this.calicoFlexVol;
    }

    public void setCalicoFlexVol(String calicoFlexVol) {
      this.calicoFlexVol = calicoFlexVol;
    }
    
    public String getCalicoNode() {
        return this.calicoNode;
    }

    public void setCalicoNode(String calicoNode) {
      this.calicoNode = calicoNode;
    }
    
    public String getCanalCni() {
        return this.canalCni;
    }

    public void setCanalCni(String canalCni) {
      this.canalCni = canalCni;
    }
    
    public String getCanalFlannel() {
        return this.canalFlannel;
    }

    public void setCanalFlannel(String canalFlannel) {
      this.canalFlannel = canalFlannel;
    }
    
    public String getCanalFlexVol() {
        return this.canalFlexVol;
    }

    public void setCanalFlexVol(String canalFlexVol) {
      this.canalFlexVol = canalFlexVol;
    }
    
    public String getCanalNode() {
        return this.canalNode;
    }

    public void setCanalNode(String canalNode) {
      this.canalNode = canalNode;
    }
    
    public String getCertDownloader() {
        return this.certDownloader;
    }

    public void setCertDownloader(String certDownloader) {
      this.certDownloader = certDownloader;
    }
    
    public String getCoredns() {
        return this.coredns;
    }

    public void setCoredns(String coredns) {
      this.coredns = coredns;
    }
    
    public String getCorednsAutoscaler() {
        return this.corednsAutoscaler;
    }

    public void setCorednsAutoscaler(String corednsAutoscaler) {
      this.corednsAutoscaler = corednsAutoscaler;
    }
    
    public String getDnsmasq() {
        return this.dnsmasq;
    }

    public void setDnsmasq(String dnsmasq) {
      this.dnsmasq = dnsmasq;
    }
    
    public String getEtcd() {
        return this.etcd;
    }

    public void setEtcd(String etcd) {
      this.etcd = etcd;
    }
    
    public String getFlannel() {
        return this.flannel;
    }

    public void setFlannel(String flannel) {
      this.flannel = flannel;
    }
    
    public String getFlannelCni() {
        return this.flannelCni;
    }

    public void setFlannelCni(String flannelCni) {
      this.flannelCni = flannelCni;
    }
    
    public String getIngress() {
        return this.ingress;
    }

    public void setIngress(String ingress) {
      this.ingress = ingress;
    }
    
    public String getIngressBackend() {
        return this.ingressBackend;
    }

    public void setIngressBackend(String ingressBackend) {
      this.ingressBackend = ingressBackend;
    }
    
    public String getKubedns() {
        return this.kubedns;
    }

    public void setKubedns(String kubedns) {
      this.kubedns = kubedns;
    }
    
    public String getKubednsAutoscaler() {
        return this.kubednsAutoscaler;
    }

    public void setKubednsAutoscaler(String kubednsAutoscaler) {
      this.kubednsAutoscaler = kubednsAutoscaler;
    }
    
    public String getKubednsSidecar() {
        return this.kubednsSidecar;
    }

    public void setKubednsSidecar(String kubednsSidecar) {
      this.kubednsSidecar = kubednsSidecar;
    }
    
    public String getKubernetes() {
        return this.kubernetes;
    }

    public void setKubernetes(String kubernetes) {
      this.kubernetes = kubernetes;
    }
    
    public String getKubernetesServicesSidecar() {
        return this.kubernetesServicesSidecar;
    }

    public void setKubernetesServicesSidecar(String kubernetesServicesSidecar) {
      this.kubernetesServicesSidecar = kubernetesServicesSidecar;
    }
    
    public String getMetricsServer() {
        return this.metricsServer;
    }

    public void setMetricsServer(String metricsServer) {
      this.metricsServer = metricsServer;
    }
    
    public String getNginxProxy() {
        return this.nginxProxy;
    }

    public void setNginxProxy(String nginxProxy) {
      this.nginxProxy = nginxProxy;
    }
    
    public String getNodelocal() {
        return this.nodelocal;
    }

    public void setNodelocal(String nodelocal) {
      this.nodelocal = nodelocal;
    }
    
    public String getPodInfraContainer() {
        return this.podInfraContainer;
    }

    public void setPodInfraContainer(String podInfraContainer) {
      this.podInfraContainer = podInfraContainer;
    }
    
    public String getWeaveCni() {
        return this.weaveCni;
    }

    public void setWeaveCni(String weaveCni) {
      this.weaveCni = weaveCni;
    }
    
    public String getWeaveNode() {
        return this.weaveNode;
    }

    public void setWeaveNode(String weaveNode) {
      this.weaveNode = weaveNode;
    }
    
    public String getWindowsPodInfraContainer() {
        return this.windowsPodInfraContainer;
    }

    public void setWindowsPodInfraContainer(String windowsPodInfraContainer) {
      this.windowsPodInfraContainer = windowsPodInfraContainer;
    }
    
}
