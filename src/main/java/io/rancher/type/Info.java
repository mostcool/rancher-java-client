package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Info extends AbstractType {

    @JsonProperty("buildDate")
    private String buildDate;

    @JsonProperty("compiler")
    private String compiler;

    @JsonProperty("gitCommit")
    private String gitCommit;

    @JsonProperty("gitTreeState")
    private String gitTreeState;

    @JsonProperty("gitVersion")
    private String gitVersion;

    @JsonProperty("goVersion")
    private String goVersion;

    @JsonProperty("major")
    private String major;

    @JsonProperty("minor")
    private String minor;

    @JsonProperty("platform")
    private String platform;
}
