package org.sparky.model.keys;

import org.sparky.model.Configuration;
import org.sparky.model.Key;
import org.sparky.model.Table;
import org.sparky.model.exceptions.InvalidColumnNameException;
import org.sparky.model.exceptions.InvalidKeyException;

import java.util.Collection;

/**
 * Created by lloyd on 19/10/2015.
 */
public class TableKey extends Key {

    private String columnName;
    private Table table;
    private Configuration root;

    protected TableKey(KeyType type, String columnName, Table referencedTable, Configuration root){
        super(type);
        this.columnName = columnName;
        this.table = referencedTable;
        this.root = root;
    }

    public TableKey(String columnName, Table referencedTable, Configuration root){
        this(KeyType.TableColumn, columnName, referencedTable, root);
    }

    @Override
    public Collection<String> values() throws InvalidColumnNameException {
        try {
            return table.valuesForColumn(columnName, root);
        } catch(InvalidKeyException e){
            throw new InvalidColumnNameException(e.getMessage());
        }
    }
}
