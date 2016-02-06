package org.sparky.model.keys;

import org.sparky.model.Key;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lloyd on 19/10/2015.
 */
public class ConstantKey extends Key {

    private String value;

    public ConstantKey(String constant){
        super(KeyType.Constant);
        this.value = constant;
    }

    @Override
    public Collection<String> values() {
        List<String> t = new ArrayList<>();
        t.add(value);
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConstantKey that = (ConstantKey) o;

        return value != null ? value.equals(that.value) : that.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
