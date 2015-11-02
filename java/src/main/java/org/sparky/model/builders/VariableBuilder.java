package org.sparky.model.builders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 17/10/2015.
 */
public class VariableBuilder implements EvaluatableBuilder, Step {
    public enum VariableType {
        Table,
        External,
        Complex
    }

    private final List<Step> steps = new ArrayList<>();
    private final VariableType type;

    public VariableBuilder(VariableType type){
        this.type = type;
    }


    @Override
    public VariableBuilder withStep(Step step) {
        steps.add(step);
        return this;
    }

    public String build(ConfigurationBuilder parent) {
        return null;
    }
}
