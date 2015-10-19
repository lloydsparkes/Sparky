package org.sparky.model.builders;

import org.sparky.model.ValueProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 19/10/2015.
 */
public class RowBuilder implements ConfigurationBuilder {

    private List<String> values = new ArrayList<>();

    public RowBuilder withValue(String value){
        values.add(value);
        return this;
    }

    @Override
    public ValueProvider build(ConfigurationBuilder parent) {
        return null;
    }
}
