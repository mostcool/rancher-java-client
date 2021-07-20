package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AuthUserInput extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    /**
     * required true
     */
    @JsonProperty("sourceCodeType")
    private String sourceCodeType;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
    }
    
    public String getSourceCodeType() {
        return this.sourceCodeType;
    }

    public void setSourceCodeType(String sourceCodeType) {
      this.sourceCodeType = sourceCodeType;
    }
    
}
