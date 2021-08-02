package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PrivateRegistry extends AbstractType {

    @JsonProperty("isDefault")
    private Boolean isDefault;

    @JsonProperty("password")
    private String password;

    @JsonProperty("url")
    private String url;

    @JsonProperty("user")
    private String user;
}
