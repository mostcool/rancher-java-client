package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HorizontalPodAutoscalerBehavior extends AbstractType {
    
    @JsonProperty("scaleDown")
    private HpaScalingRules scaleDown;
    
    @JsonProperty("scaleUp")
    private HpaScalingRules scaleUp;
    
    public HpaScalingRules getScaleDown() {
        return this.scaleDown;
    }

    public void setScaleDown(HpaScalingRules scaleDown) {
      this.scaleDown = scaleDown;
    }
    
    public HpaScalingRules getScaleUp() {
        return this.scaleUp;
    }

    public void setScaleUp(HpaScalingRules scaleUp) {
      this.scaleUp = scaleUp;
    }
    
}
