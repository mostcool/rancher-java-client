package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SaveAsTemplateInput extends AbstractType {

    @JsonProperty("clusterTemplateName")
    private String clusterTemplateName;

    @JsonProperty("clusterTemplateRevisionName")
    private String clusterTemplateRevisionName;
}
