package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SetPodSecurityPolicyTemplateInput extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("podSecurityPolicyTemplateId")
    private String podSecurityPolicyTemplateId;
}
