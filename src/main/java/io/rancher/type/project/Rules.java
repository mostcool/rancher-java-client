package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Rules extends AbstractType {
    
    @JsonProperty("alert")
    private RulesAlert alert;
    
    public RulesAlert getAlert() {
        return this.alert;
    }

    public void setAlert(RulesAlert alert) {
      this.alert = alert;
    }
    
}
