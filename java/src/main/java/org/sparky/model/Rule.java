package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 20/10/2015.
 */
public class Rule {
    interface Bit {
        String getValue(Configuration root) throws InvalidKeyException;
    }

    public class PlainBit implements Bit {

        private String value;

        @Override
        public String getValue(Configuration root) {
            return value;
        }
    }

    public class KeyBit implements Bit {

        private String key;

        @Override
        public String getValue(Configuration root) throws InvalidKeyException {
            return root.get(key);
        }
    }

    private List<Bit> bits = new ArrayList<>();

    public String resolve(Configuration root) throws InvalidKeyException {
        StringBuilder builder = new StringBuilder();
        for(Bit b : bits){
            builder.append(b.getValue(root));
        }
        return builder.toString();
    }
}
