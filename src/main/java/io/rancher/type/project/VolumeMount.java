package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VolumeMount extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("mountPath")
    private String mountPath;

    @JsonProperty("mountPropagation")
    private String mountPropagation;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("subPath")
    private String subPath;

    @JsonProperty("subPathExpr")
    private String subPathExpr;
}
