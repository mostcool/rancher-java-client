package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RulesAlert extends AbstractType {

    @JsonProperty("forGracePeriod")
    private String forGracePeriod;

    @JsonProperty("forOutageTolerance")
    private String forOutageTolerance;

    @JsonProperty("resendDelay")
    private String resendDelay;
}
