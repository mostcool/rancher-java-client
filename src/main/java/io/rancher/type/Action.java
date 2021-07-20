package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Action extends AbstractType {
    
    @JsonProperty("input")
    private String input;
    
    @JsonProperty("output")
    private String output;
    
    public String getInput() {
        return this.input;
    }

    public void setInput(String input) {
      this.input = input;
    }
    
    public String getOutput() {
        return this.output;
    }

    public void setOutput(String output) {
      this.output = output;
    }
    
}
