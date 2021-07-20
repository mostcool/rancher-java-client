package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class RelabelConfig extends AbstractType {
    
    @JsonProperty("action")
    private String action;
    
    @JsonProperty("modulus")
    private Integer modulus;
    
    @JsonProperty("regex")
    private String regex;
    
    @JsonProperty("replacement")
    private String replacement;
    
    @JsonProperty("separator")
    private String separator;
    
    @JsonProperty("sourceLabels")
    private List<String> sourceLabels;
    
    @JsonProperty("targetLabel")
    private String targetLabel;
    
    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
      this.action = action;
    }
    
    public Integer getModulus() {
        return this.modulus;
    }

    public void setModulus(Integer modulus) {
      this.modulus = modulus;
    }
    
    public String getRegex() {
        return this.regex;
    }

    public void setRegex(String regex) {
      this.regex = regex;
    }
    
    public String getReplacement() {
        return this.replacement;
    }

    public void setReplacement(String replacement) {
      this.replacement = replacement;
    }
    
    public String getSeparator() {
        return this.separator;
    }

    public void setSeparator(String separator) {
      this.separator = separator;
    }
    
    public List<String> getSourceLabels() {
        return this.sourceLabels;
    }

    public void setSourceLabels(List<String> sourceLabels) {
      this.sourceLabels = sourceLabels;
    }
    
    public String getTargetLabel() {
        return this.targetLabel;
    }

    public void setTargetLabel(String targetLabel) {
      this.targetLabel = targetLabel;
    }
    
}
