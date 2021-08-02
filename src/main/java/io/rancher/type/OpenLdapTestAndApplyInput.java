package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OpenLdapTestAndApplyInput extends AbstractType {

    @JsonProperty("ldapConfig")
    private LdapConfig ldapConfig;

    /**
     * required true
     */
    @JsonProperty("password")
    private String password;

    @JsonProperty("username")
    private String username;
}
