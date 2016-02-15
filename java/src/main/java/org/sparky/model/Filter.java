package org.sparky.model;

import org.sparky.model.exceptions.InvalidColumnNameException;
import org.sparky.model.exceptions.InvalidKeyException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by lloyd on 26/10/2015.
 */
public class Filter {

    private String lastValue;
    private Rule valueKey;

    public Filter(Rule valueKey) {
        this.valueKey = valueKey;
    }

    public boolean hasChanged(Configuration root) throws InvalidKeyException {
        if(lastValue == null){
            return true;
        }
        return lastValue.equals(getValue(root));
    }

    public String getValue(Configuration root) throws InvalidKeyException {
        return valueKey.getValue(root, null);
    }
}
