package org.sparky.model.builders;

import org.sparky.model.ValueProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 17/10/2015.
 */
public class ValueBuilder implements EvaluatableBuilder {

    private final List<Step> steps = new ArrayList<>();

    @Override
    public ValueBuilder withStep(Step step) {
        steps.add(step);
        return this;
    }

    @Override
    public ValueProvider build(ConfigurationBuilder parent) {
        return null;
    }
}
