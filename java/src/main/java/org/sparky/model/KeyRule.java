package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;

import java.util.List;

/**
 * Created by lloyd on 15/02/2016.
 */
public class KeyRule extends Rule {
    public KeyRule(List<Bit> bits) {
        super(bits);
    }

    @Override
    public String getValue(Configuration root, Table currentTable) throws InvalidKeyException {
        StringBuilder key = new StringBuilder();

        for(Bit b : bits){
            if(key.length() > 0){
                key.append(".");
            }
            if(b instanceof KeyRule){
                key.append(b.getValue(root, currentTable));
            } else {
                key.append(((KeyBit)b).getKey());
            }
        }
        KeyBit kb = new KeyBit(key.toString());
        return kb.getValue(root, currentTable);
    }
}
