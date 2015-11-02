package org.sparky.model;

import org.sparky.model.exceptions.InvalidColumnNameException;
import org.sparky.model.exceptions.InvalidKeyException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by lloyd on 26/10/2015.
 */
public class Filter {

    private String lastValue;
    private String valueKey;

    public boolean hasChanged(Configuration root) throws InvalidKeyException {
        if(lastValue == null){
            return false;
        }
        return lastValue.equals(getValue(root));
    }

    public String getValue(Configuration root) throws InvalidKeyException {
        return root.get(valueKey);
    }
}
