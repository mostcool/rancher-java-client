package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ExportOutput extends AbstractType {
    
    @JsonProperty("yamlOutput")
    private String yamlOutput;
    
    public String getYamlOutput() {
        return this.yamlOutput;
    }

    public void setYamlOutput(String yamlOutput) {
      this.yamlOutput = yamlOutput;
    }
    
}
