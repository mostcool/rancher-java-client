package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class SecurityContext extends AbstractType {

    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;

    @JsonProperty("capAdd")
    private List<String> capAdd;

    @JsonProperty("capDrop")
    private List<String> capDrop;

    @JsonProperty("privileged")
    private Boolean privileged;

    @JsonProperty("procMount")
    private String procMount;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("runAsGroup")
    private Integer runAsGroup;

    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;

    @JsonProperty("uid")
    private Integer uid;

    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;
}
