package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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
}
