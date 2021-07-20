package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class Rule extends AbstractType {
    
    @JsonProperty("alert")
    private String alert;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("expr")
    private Integer exprFlag;
    
    @JsonProperty("for")
    private String forFlag;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("record")
    private String record;
    
    public String getAlert() {
        return this.alert;
    }

    public void setAlert(String alert) {
      this.alert = alert;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Integer getExprFlag() {
        return this.exprFlag;
    }

    public void setExprFlag(Integer exprFlag) {
      this.exprFlag = exprFlag;
    }
    
    public String getForFlag() {
        return this.forFlag;
    }

    public void setForFlag(String forFlag) {
      this.forFlag = forFlag;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getRecord() {
        return this.record;
    }

    public void setRecord(String record) {
      this.record = record;
    }
    
}
