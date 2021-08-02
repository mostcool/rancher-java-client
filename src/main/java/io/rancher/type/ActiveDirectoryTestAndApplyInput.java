package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ActiveDirectoryTestAndApplyInput extends AbstractType {

    @JsonProperty("activeDirectoryConfig")
    private ActiveDirectoryConfig activeDirectoryConfig;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("password")
    private String password;

    @JsonProperty("username")
    private String username;
}
