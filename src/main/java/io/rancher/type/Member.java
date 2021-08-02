package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Member extends AbstractType {

    @JsonProperty("accessType")
    private String accessType;

    @JsonProperty("groupPrincipalId")
    private String groupPrincipalId;

    @JsonProperty("userPrincipalId")
    private String userPrincipalId;
}
