package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Field extends AbstractType {
    
    @JsonProperty("create")
    private Boolean create;
    
    @JsonProperty("default")
    private Boolean defaultFlag;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("dynamicField")
    private Boolean dynamicField;
    
    @JsonProperty("invalidChars")
    private String invalidChars;
    
    @JsonProperty("max")
    private Integer max;
    
    @JsonProperty("maxLength")
    private Integer maxLength;
    
    @JsonProperty("min")
    private Integer min;
    
    @JsonProperty("minLength")
    private Integer minLength;
    
    @JsonProperty("nullable")
    private Boolean nullable;
    
    @JsonProperty("options")
    private List<String> options;
    
    @JsonProperty("required")
    private Boolean required;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("unique")
    private Boolean unique;
    
    @JsonProperty("update")
    private Boolean update;
    
    @JsonProperty("validChars")
    private String validChars;
    
    public Boolean getCreate() {
        return this.create;
    }

    public void setCreate(Boolean create) {
      this.create = create;
    }
    
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
    
    public Boolean getDynamicField() {
        return this.dynamicField;
    }

    public void setDynamicField(Boolean dynamicField) {
      this.dynamicField = dynamicField;
    }
    
    public String getInvalidChars() {
        return this.invalidChars;
    }

    public void setInvalidChars(String invalidChars) {
      this.invalidChars = invalidChars;
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
    
    public Boolean getNullable() {
        return this.nullable;
    }

    public void setNullable(Boolean nullable) {
      this.nullable = nullable;
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
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public Boolean getUnique() {
        return this.unique;
    }

    public void setUnique(Boolean unique) {
      this.unique = unique;
    }
    
    public Boolean getUpdate() {
        return this.update;
    }

    public void setUpdate(Boolean update) {
      this.update = update;
    }
    
    public String getValidChars() {
        return this.validChars;
    }

    public void setValidChars(String validChars) {
      this.validChars = validChars;
    }
    
}
