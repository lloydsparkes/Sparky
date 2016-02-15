package org.sparky.model;

import org.sparky.model.exceptions.InvalidColumnNameException;

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

    public boolean matches(String toTest, Configuration root) throws InvalidColumnNameException {
        for(String s : values(root)){
            if(s.equals(toTest)){
                return true;
            }
        }
        return false;
    }

    public abstract Collection<String> values(Configuration root) throws InvalidColumnNameException;
}
