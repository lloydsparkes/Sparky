package org.sparky.model.builders;

import org.sparky.model.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 19/10/2015.
 */
public class TableBuilder implements ConfigurationBuilder {

    private List<FilterBuilder> filters = new ArrayList<>();
    private List<String> headers  = new ArrayList<>();
    private List<RowBuilder> rows = new ArrayList<>();

    public TableBuilder withHeader(String header){
        headers.add(header);
        return this;
    }

    public TableBuilder withRow(RowBuilder row){
        rows.add(row);
        return this;
    }

    public TableBuilder withFilter(FilterBuilder filter){
        filters.add(filter);
        return this;
    }

    public Table build(ConfigurationBuilder parent) {
        return null;
    }
}
