package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Question extends AbstractType {
    
    @JsonProperty("default")
    private Boolean defaultFlag;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("group")
    private String group;
    
    @JsonProperty("invalidChars")
    private String invalidChars;
    
    @JsonProperty("label")
    private String label;
    
    @JsonProperty("max")
    private Integer max;
    
    @JsonProperty("maxLength")
    private Integer maxLength;
    
    @JsonProperty("min")
    private Integer min;
    
    @JsonProperty("minLength")
    private Integer minLength;
    
    @JsonProperty("options")
    private List<String> options;
    
    @JsonProperty("required")
    private Boolean required;
    
    @JsonProperty("satisfies")
    private String satisfies;
    
    @JsonProperty("showIf")
    private String showIf;
    
    @JsonProperty("showSubquestionIf")
    private String showSubquestionIf;
    
    @JsonProperty("subquestions")
    private List<SubQuestion> subquestions;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("validChars")
    private String validChars;
    
    @JsonProperty("variable")
    private String variable;
    
    public Boolean getDefaultFlag() {
        return this.defaultFlag;
    }

    public void setDefaultFlag(Boolean defaultFlag) {
      this.defaultFlag = defaultFlag;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
      this.group = group;
    }
    
    public String getInvalidChars() {
        return this.invalidChars;
    }

    public void setInvalidChars(String invalidChars) {
      this.invalidChars = invalidChars;
    }
    
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
      this.label = label;
    }
    
    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
      this.max = max;
    }
    
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(Integer maxLength) {
      this.maxLength = maxLength;
    }
    
    public Integer getMin() {
        return this.min;
    }

    public void setMin(Integer min) {
      this.min = min;
    }
    
    public Integer getMinLength() {
        return this.minLength;
    }

    public void setMinLength(Integer minLength) {
      this.minLength = minLength;
    }
    
    public List<String> getOptions() {
        return this.options;
    }

    public void setOptions(List<String> options) {
      this.options = options;
    }
    
    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
      this.required = required;
    }
    
    public String getSatisfies() {
        return this.satisfies;
    }

    public void setSatisfies(String satisfies) {
      this.satisfies = satisfies;
    }
    
    public String getShowIf() {
        return this.showIf;
    }

    public void setShowIf(String showIf) {
      this.showIf = showIf;
    }
    
    public String getShowSubquestionIf() {
        return this.showSubquestionIf;
    }

    public void setShowSubquestionIf(String showSubquestionIf) {
      this.showSubquestionIf = showSubquestionIf;
    }
    
    public List<SubQuestion> getSubquestions() {
        return this.subquestions;
    }

    public void setSubquestions(List<SubQuestion> subquestions) {
      this.subquestions = subquestions;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getValidChars() {
        return this.validChars;
    }

    public void setValidChars(String validChars) {
      this.validChars = validChars;
    }
    
    public String getVariable() {
        return this.variable;
    }

    public void setVariable(String variable) {
      this.variable = variable;
    }
    
}
