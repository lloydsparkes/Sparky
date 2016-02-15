package org.sparky.model.builders;

import org.sparky.model.Filter;
import org.sparky.model.Rule;

import java.util.HashMap;
import java.util.Map;

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
        right = variableBuilder;
        return this;
    }

    public String columnName(){
        return left.buildAsColumnName();
    }

    public Rule getRule() {
        return right.build();
    }
}
