package org.sparky.model.keys;

import org.sparky.model.Key;
import org.sparky.model.Table;
import org.sparky.model.exceptions.InvalidColumnNameException;

import java.util.Collection;

/**
 *
 *
 * Created by lloyd on 19/10/2015.
 */
public class IndexerKey extends Key {

    private Table table;

    public IndexerKey(Table referencedTable) {
        super(KeyType.Indexer);
        this.table = referencedTable;
    }

    @Override
    public Collection<String> values() throws InvalidColumnNameException {
        return table.valuesForColumn("$$");
    }
}
