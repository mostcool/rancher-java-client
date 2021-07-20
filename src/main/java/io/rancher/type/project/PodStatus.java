package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PodStatus extends AbstractType {
    
    @JsonProperty("conditions")
    private List<PodCondition> conditions;
    
    @JsonProperty("containerStatuses")
    private List<ContainerStatus> containerStatuses;
    
    @JsonProperty("ephemeralContainerStatuses")
    private List<ContainerStatus> ephemeralContainerStatuses;
    
    @JsonProperty("initContainerStatuses")
    private List<ContainerStatus> initContainerStatuses;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("nodeIp")
    private String nodeIp;
    
    @JsonProperty("nominatedNodeName")
    private String nominatedNodeName;
    
    @JsonProperty("phase")
    private String phase;
    
    @JsonProperty("podIPs")
    private List<PodIP> podIps;
    
    @JsonProperty("podIp")
    private String podIp;
    
    @JsonProperty("qosClass")
    private String qosClass;
    
    @JsonProperty("reason")
    private String reason;
    
    @JsonProperty("startTime")
    private String startTime;
    
    public List<PodCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<PodCondition> conditions) {
      this.conditions = conditions;
    }
    
    public List<ContainerStatus> getContainerStatuses() {
        return this.containerStatuses;
    }

    public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
      this.containerStatuses = containerStatuses;
    }
    
    public List<ContainerStatus> getEphemeralContainerStatuses() {
        return this.ephemeralContainerStatuses;
    }

    public void setEphemeralContainerStatuses(List<ContainerStatus> ephemeralContainerStatuses) {
      this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    }
    
    public List<ContainerStatus> getInitContainerStatuses() {
        return this.initContainerStatuses;
    }

    public void setInitContainerStatuses(List<ContainerStatus> initContainerStatuses) {
      this.initContainerStatuses = initContainerStatuses;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getNodeIp() {
        return this.nodeIp;
    }

    public void setNodeIp(String nodeIp) {
      this.nodeIp = nodeIp;
    }
    
    public String getNominatedNodeName() {
        return this.nominatedNodeName;
    }

    public void setNominatedNodeName(String nominatedNodeName) {
      this.nominatedNodeName = nominatedNodeName;
    }
    
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
      this.phase = phase;
    }
    
    public List<PodIP> getPodIps() {
        return this.podIps;
    }

    public void setPodIps(List<PodIP> podIps) {
      this.podIps = podIps;
    }
    
    public String getPodIp() {
        return this.podIp;
    }

    public void setPodIp(String podIp) {
      this.podIp = podIp;
    }
    
    public String getQosClass() {
        return this.qosClass;
    }

    public void setQosClass(String qosClass) {
      this.qosClass = qosClass;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
      this.startTime = startTime;
    }
    
}
