package org.sparky.model.builders;

import org.sparky.model.Bit;
import org.sparky.model.Rule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 17/10/2015.
 */
public class VariableBuilder implements EvaluatableBuilder {

    private final List<Bit> bits = new ArrayList<>();

    @Override
    public VariableBuilder withBit(Bit bit) {
        bits.add(bit);
        return this;
    }

    @Override
    public Rule build() {
        return new Rule(bits);
    }
}
