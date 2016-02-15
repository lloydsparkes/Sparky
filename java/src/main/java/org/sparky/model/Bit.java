package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;

/**
 * Created by lloyd on 06/02/2016.
 */
public interface Bit {
    String getValue(Configuration root, Table currentTable) throws InvalidKeyException;
}
