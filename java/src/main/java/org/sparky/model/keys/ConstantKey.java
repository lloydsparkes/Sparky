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
}
