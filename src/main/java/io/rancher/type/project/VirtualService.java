package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class VirtualService extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("gateways")
    private List<String> gateways;
    
    @JsonProperty("hosts")
    private List<String> hosts;
    
    @JsonProperty("http")
    private List<HttpRoute> http;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private Map<String, Object> status;
    
    @JsonProperty("tcp")
    private List<TcpRoute> tcp;
    
    @JsonProperty("tls")
    private List<TlsRoute> tls;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public List<String> getGateways() {
        return this.gateways;
    }

    public void setGateways(List<String> gateways) {
      this.gateways = gateways;
    }
    
    public List<String> getHosts() {
        return this.hosts;
    }

    public void setHosts(List<String> hosts) {
      this.hosts = hosts;
    }
    
    public List<HttpRoute> getHttp() {
        return this.http;
    }

    public void setHttp(List<HttpRoute> http) {
      this.http = http;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Map<String, Object> getStatus() {
        return this.status;
    }

    public void setStatus(Map<String, Object> status) {
      this.status = status;
    }
    
    public List<TcpRoute> getTcp() {
        return this.tcp;
    }

    public void setTcp(List<TcpRoute> tcp) {
      this.tcp = tcp;
    }
    
    public List<TlsRoute> getTls() {
        return this.tls;
    }

    public void setTls(List<TlsRoute> tls) {
      this.tls = tls;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
