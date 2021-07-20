package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RunScriptConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("shellScript")
    private String shellScript;
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getShellScript() {
        return this.shellScript;
    }

    public void setShellScript(String shellScript) {
      this.shellScript = shellScript;
    }
    
}
