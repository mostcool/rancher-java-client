package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class RkeConfigNodePlan extends AbstractType {
    
    @JsonProperty("address")
    private String address;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("files")
    private List<File> files;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("portChecks")
    private List<PortCheck> portChecks;
    
    @JsonProperty("processes")
    private Map<String, Object> processes;
    
    @JsonProperty("taints")
    private List<RkeTaint> taints;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public List<File> getFiles() {
        return this.files;
    }

    public void setFiles(List<File> files) {
      this.files = files;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<PortCheck> getPortChecks() {
        return this.portChecks;
    }

    public void setPortChecks(List<PortCheck> portChecks) {
      this.portChecks = portChecks;
    }
    
    public Map<String, Object> getProcesses() {
        return this.processes;
    }

    public void setProcesses(Map<String, Object> processes) {
      this.processes = processes;
    }
    
    public List<RkeTaint> getTaints() {
        return this.taints;
    }

    public void setTaints(List<RkeTaint> taints) {
      this.taints = taints;
    }
    
}
