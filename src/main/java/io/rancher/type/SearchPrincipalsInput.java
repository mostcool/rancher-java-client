package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SearchPrincipalsInput extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("principalType")
    private String principalType;
}
