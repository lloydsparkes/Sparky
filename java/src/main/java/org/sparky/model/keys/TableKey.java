package org.sparky.model.keys;

import org.sparky.model.Key;
import org.sparky.model.Table;
import org.sparky.model.exceptions.InvalidColumnNameException;

import java.util.Collection;

/**
 * Created by lloyd on 19/10/2015.
 */
public class TableKey extends Key {

    private String columnName;
    private Table table;

    public TableKey(String columnName, Table referencedTable){
        super(KeyType.TableColumn);
        this.columnName = columnName;
        this.table = referencedTable;
    }

    @Override
    public Collection<String> values() throws InvalidColumnNameException {
        return table.valuesForColumn(columnName);
    }
}
