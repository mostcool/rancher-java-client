package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class MonitoringOutput extends AbstractType {
    
    @JsonProperty("answers")
    private Map<String, Object> answers;
    
    @JsonProperty("version")
    private String version;
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
}
