package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class AlertingSpec extends AbstractType {
    
    @JsonProperty("alertmanagers")
    private List<AlertmanagerEndpoints> alertmanagers;
    
    public List<AlertmanagerEndpoints> getAlertmanagers() {
        return this.alertmanagers;
    }

    public void setAlertmanagers(List<AlertmanagerEndpoints> alertmanagers) {
      this.alertmanagers = alertmanagers;
    }
    
}
