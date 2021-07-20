package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CisScanStatus extends AbstractType {
    
    @JsonProperty("fail")
    private Integer fail;
    
    @JsonProperty("notApplicable")
    private Integer notApplicable;
    
    @JsonProperty("pass")
    private Integer pass;
    
    @JsonProperty("skip")
    private Integer skip;
    
    @JsonProperty("total")
    private Integer total;
    
    public Integer getFail() {
        return this.fail;
    }

    public void setFail(Integer fail) {
      this.fail = fail;
    }
    
    public Integer getNotApplicable() {
        return this.notApplicable;
    }

    public void setNotApplicable(Integer notApplicable) {
      this.notApplicable = notApplicable;
    }
    
    public Integer getPass() {
        return this.pass;
    }

    public void setPass(Integer pass) {
      this.pass = pass;
    }
    
    public Integer getSkip() {
        return this.skip;
    }

    public void setSkip(Integer skip) {
      this.skip = skip;
    }
    
    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
      this.total = total;
    }
    
}
