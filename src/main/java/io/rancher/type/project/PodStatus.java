package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
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
}
