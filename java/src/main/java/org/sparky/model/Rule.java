package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;

import java.util.Collection;
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
        public String getValue(Configuration root, Table currentTable) {
            return value;
        }
    }

    public static class KeyBit implements Bit {

        private String key;

        public KeyBit(String key){
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        @Override
        public String getValue(Configuration root, Table currentTable) throws InvalidKeyException {
            if(!key.toUpperCase().equals(key) && !key.contains(".")){
                //Attempt a Table lookup
                List<String> values = currentTable.valuesForColumn(key, root);
                if(values.size() == 1){
                    return values.get(0);
                }
            }
            return root.get(key);
        }
    }

    protected List<Bit> bits;

    public Rule(List<Bit> bits){
        this.bits = bits;
    }

    @Override
    public String getValue(Configuration root, Table currentTable) throws InvalidKeyException {
        return resolve(root, currentTable);
    }

    private String resolve(Configuration root, Table currentTable) throws InvalidKeyException {
        StringBuilder builder = new StringBuilder();
        for(Bit b : bits){
            builder.append(b.getValue(root, currentTable));
        }
        return builder.toString();
    }
}
