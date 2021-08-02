package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class UpdateMultiClusterAppTargetsInput extends AbstractType {

    @JsonProperty("answers")
    private List<Answer> answers;

    /**
     * required true
     */
    @JsonProperty("projects")
    private List<String> projects;
}
