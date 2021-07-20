package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RulesAlert extends AbstractType {
    
    @JsonProperty("forGracePeriod")
    private String forGracePeriod;
    
    @JsonProperty("forOutageTolerance")
    private String forOutageTolerance;
    
    @JsonProperty("resendDelay")
    private String resendDelay;
    
    public String getForGracePeriod() {
        return this.forGracePeriod;
    }

    public void setForGracePeriod(String forGracePeriod) {
      this.forGracePeriod = forGracePeriod;
    }
    
    public String getForOutageTolerance() {
        return this.forOutageTolerance;
    }

    public void setForOutageTolerance(String forOutageTolerance) {
      this.forOutageTolerance = forOutageTolerance;
    }
    
    public String getResendDelay() {
        return this.resendDelay;
    }

    public void setResendDelay(String resendDelay) {
      this.resendDelay = resendDelay;
    }
    
}
