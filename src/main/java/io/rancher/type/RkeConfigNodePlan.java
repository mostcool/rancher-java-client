package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class RkeConfigNodePlan extends AbstractType {

    @JsonProperty("address")
    private String address;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("files")
    private List<File> files;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("portChecks")
    private List<PortCheck> portChecks;

    @JsonProperty("processes")
    private Map<String, Object> processes;

    @JsonProperty("taints")
    private List<RkeTaint> taints;
}
