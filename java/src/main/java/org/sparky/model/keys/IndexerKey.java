package org.sparky.model.keys;

import org.sparky.model.Configuration;
import org.sparky.model.Key;
import org.sparky.model.Table;
import org.sparky.model.exceptions.InvalidColumnNameException;

import java.util.Collection;

/**
 *
 *
 * Created by lloyd on 19/10/2015.
 */
public class IndexerKey extends TableKey {

    public IndexerKey(Table referencedTable, Configuration root) {
        super(KeyType.Indexer, "$$", referencedTable, root);
    }

}
