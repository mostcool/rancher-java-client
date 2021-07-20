package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class UpdateMultiClusterAppTargetsInput extends AbstractType {
    
    @JsonProperty("answers")
    private List<Answer> answers;
    
    /**
     * required true
     */
    @JsonProperty("projects")
    private List<String> projects;
    
    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setAnswers(List<Answer> answers) {
      this.answers = answers;
    }
    
    public List<String> getProjects() {
        return this.projects;
    }

    public void setProjects(List<String> projects) {
      this.projects = projects;
    }
    
}
