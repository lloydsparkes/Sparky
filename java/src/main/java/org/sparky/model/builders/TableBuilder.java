package org.sparky.model.builders;

import org.sparky.model.Filter;
import org.sparky.model.Rule;
import org.sparky.model.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lloyd on 19/10/2015.
 */
public class TableBuilder {

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

    public Table build() {
        Map<String, Integer> columns = new HashMap<>();
        int i = 0;
        for(String col : headers){
            columns.put(col, i++);
        }

        String[][] data = new String[rows.size()][headers.size()];
        int rowIndex = 0;
        for(RowBuilder builder : rows){
            for(int colIndex = 0; colIndex < headers.size(); colIndex++){
                data[rowIndex][colIndex] = builder.get(colIndex);
            }
            rowIndex++;
        }

        Map<String, Filter> fl = new HashMap<>();
        for(FilterBuilder b : filters){
            fl.put(b.columnName(), new Filter(b.getRule()));
        }

        return new Table(columns, data, fl);
    }
}
