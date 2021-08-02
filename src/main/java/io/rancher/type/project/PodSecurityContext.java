package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PodSecurityContext extends AbstractType {

    @JsonProperty("fsGroupChangePolicy")
    private String fsGroupChangePolicy;

    @JsonProperty("fsgid")
    private Integer fsgid;

    @JsonProperty("gids")
    private List<Integer> gids;

    @JsonProperty("runAsGroup")
    private Integer runAsGroup;

    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;

    @JsonProperty("sysctls")
    private List<Sysctl> sysctls;

    @JsonProperty("uid")
    private Integer uid;

    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;
}
