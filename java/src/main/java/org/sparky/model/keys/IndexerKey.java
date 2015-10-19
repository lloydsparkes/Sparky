package org.sparky.model.keys;

import org.sparky.model.Key;
import org.sparky.model.Table;

import java.util.Collection;

/**
 *
 *
 * Created by lloyd on 19/10/2015.
 */
public class IndexerKey extends Key {

    public IndexerKey() {
        super(KeyType.Indexer);
    }

    @Override
    public Collection<String> values(Table nearestTable) {
        return null;
    }
}
