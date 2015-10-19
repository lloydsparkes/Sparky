package org.sparky.model.keys;

import org.sparky.model.Key;
import org.sparky.model.Table;
import org.sparky.model.ValueProvider;

import java.util.Collection;

/**
 * Created by lloyd on 19/10/2015.
 */
public class TableKey extends Key {

    private String columnName;

    public TableKey(String columnName){
        super(KeyType.TableColumn);
        this.columnName = columnName;
    }

    @Override
    public Collection<String> values(Table nearestTable) {
        //TODO: Implement Table Lookups
        return null;
    }
}
