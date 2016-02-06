package org.sparky.model.builders;

import org.sparky.model.Filter;

/**
 * Created by lloyd on 19/10/2015.
 */
public class FilterBuilder {

    private VariableBuilder left;
    private VariableBuilder right;

    public FilterBuilder withLeft(VariableBuilder variableBuilder){
        left = variableBuilder;
        return this;
    }

    public FilterBuilder withRight(VariableBuilder variableBuilder){
        left = variableBuilder;
        return this;
    }

    public Filter build() {
        return null;
    }
}
