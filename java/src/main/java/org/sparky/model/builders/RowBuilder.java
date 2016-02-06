package org.sparky.model.builders;

import org.sparky.model.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 19/10/2015.
 */
public class RowBuilder {

    private List<String> values = new ArrayList<>();

    public RowBuilder withValue(String value){
        values.add(value);
        return this;
    }

    public Table build() {
        return null;
    }
}
