package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ChangePasswordInput extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("currentPassword")
    private String currentPassword;

    /**
     * required true
     */
    @JsonProperty("newPassword")
    private String newPassword;
}
