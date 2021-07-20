package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class HeaderOperations extends AbstractType {
    
    @JsonProperty("add")
    private Map<String, Object> add;
    
    @JsonProperty("remove")
    private List<String> remove;
    
    @JsonProperty("set")
    private Map<String, Object> set;
    
    public Map<String, Object> getAdd() {
        return this.add;
    }

    public void setAdd(Map<String, Object> add) {
      this.add = add;
    }
    
    public List<String> getRemove() {
        return this.remove;
    }

    public void setRemove(List<String> remove) {
      this.remove = remove;
    }
    
    public Map<String, Object> getSet() {
        return this.set;
    }

    public void setSet(Map<String, Object> set) {
      this.set = set;
    }
    
}
