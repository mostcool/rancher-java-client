package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SetPodSecurityPolicyTemplateInput extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("podSecurityPolicyTemplateId")
    private String podSecurityPolicyTemplateId;
    
    public String getPodSecurityPolicyTemplateId() {
        return this.podSecurityPolicyTemplateId;
    }

    public void setPodSecurityPolicyTemplateId(String podSecurityPolicyTemplateId) {
      this.podSecurityPolicyTemplateId = podSecurityPolicyTemplateId;
    }
    
}
