package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class File extends AbstractType {
    
    @JsonProperty("contents")
    private String contents;
    
    @JsonProperty("name")
    private String name;
    
    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
      this.contents = contents;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
