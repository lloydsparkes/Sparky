package org.sparky.model.builders;

import org.sparky.model.Bit;
import org.sparky.model.Rule;

/**
 * Created by lloyd on 17/10/2015.
 */
public interface EvaluatableBuilder {

    EvaluatableBuilder withBit(Bit bit);

    Rule build();
}
