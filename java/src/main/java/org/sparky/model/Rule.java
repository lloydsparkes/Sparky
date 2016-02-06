package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;

import java.util.List;

/**
 * Created by lloyd on 20/10/2015.
 */
public class Rule implements Bit {
    public static class PlainBit implements Bit {

        private String value;

        public PlainBit(String value){
            this.value = value;
        }

        @Override
        public String getValue(Configuration root) {
            return value;
        }
    }

    public static class KeyBit implements Bit {

        private String key;

        public KeyBit(String key){
            this.key = key;
        }

        @Override
        public String getValue(Configuration root) throws InvalidKeyException {
            return root.get(key);
        }
    }

    private List<Bit> bits;

    public Rule(List<Bit> bits){
        this.bits = bits;
    }

    @Override
    public String getValue(Configuration root) throws InvalidKeyException {
        return resolve(root);
    }

    public String resolve(Configuration root) throws InvalidKeyException {
        StringBuilder builder = new StringBuilder();
        for(Bit b : bits){
            builder.append(b.getValue(root));
        }
        return builder.toString();
    }
}
