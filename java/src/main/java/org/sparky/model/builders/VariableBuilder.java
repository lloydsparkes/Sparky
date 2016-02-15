package org.sparky.model.builders;

import org.sparky.model.Bit;
import org.sparky.model.KeyRule;
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
        return new KeyRule(bits);
    }

    public String buildAsColumnName(){
        if(bits.size() != 1){
            throw new IllegalStateException("A TableColumn Variable should only have a single bit");
        }
        if(!(bits.get(0) instanceof Rule.KeyBit)){
            throw new IllegalStateException("A TableColumn Variable should only have a single KeyBit");
        }
        return ((Rule.KeyBit)bits.get(0)).getKey();
    }
}
