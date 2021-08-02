package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HttpFaultInjection extends AbstractType {

    @JsonProperty("abort")
    private InjectAbort abort;

    @JsonProperty("delay")
    private InjectDelay delay;
}
