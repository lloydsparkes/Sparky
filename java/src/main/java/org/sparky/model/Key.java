package org.sparky.model;

import java.util.Collection;

/**
 * Represents a Key
 *
 * Created by lloyd on 19/10/2015.
 */
public abstract class Key {
    public enum KeyType {
        Constant,
        TableColumn,
        Indexer
    }

    private final KeyType type;

    public Key(KeyType type){
        this.type = type;
    }

    public abstract Collection<String> values(Table nearestTable);
}
