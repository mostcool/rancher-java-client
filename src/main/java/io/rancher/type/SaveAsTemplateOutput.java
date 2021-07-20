package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SaveAsTemplateOutput extends AbstractType {
    
    @JsonProperty("clusterTemplateName")
    private String clusterTemplateName;
    
    @JsonProperty("clusterTemplateRevisionName")
    private String clusterTemplateRevisionName;
    
    public String getClusterTemplateName() {
        return this.clusterTemplateName;
    }

    public void setClusterTemplateName(String clusterTemplateName) {
      this.clusterTemplateName = clusterTemplateName;
    }
    
    public String getClusterTemplateRevisionName() {
        return this.clusterTemplateRevisionName;
    }

    public void setClusterTemplateRevisionName(String clusterTemplateRevisionName) {
      this.clusterTemplateRevisionName = clusterTemplateRevisionName;
    }
    
}
