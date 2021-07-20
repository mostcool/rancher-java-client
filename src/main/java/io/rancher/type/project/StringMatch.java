package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StringMatch extends AbstractType {
    
    @JsonProperty("exact")
    private String exact;
    
    @JsonProperty("prefix")
    private String prefix;
    
    @JsonProperty("regex")
    private String regex;
    
    @JsonProperty("suffix")
    private String suffix;
    
    public String getExact() {
        return this.exact;
    }

    public void setExact(String exact) {
      this.exact = exact;
    }
    
    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
      this.prefix = prefix;
    }
    
    public String getRegex() {
        return this.regex;
    }

    public void setRegex(String regex) {
      this.regex = regex;
    }
    
    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
      this.suffix = suffix;
    }
    
}
