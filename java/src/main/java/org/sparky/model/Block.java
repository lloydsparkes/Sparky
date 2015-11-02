package org.sparky.model;

import org.sparky.model.exceptions.InvalidColumnNameException;
import org.sparky.model.exceptions.InvalidKeyException;

import java.util.*;

/**
 * Represents a block of configuration, it has its own name.
 *
 * It presumes that it will only be given requests for keys relative to itself.
 *
 * It will only return keys relative to itself
 *
 * For e.g.
 *
 * block1:
 *      block2:
 *          block3:
 *              key = value
 *
 *  to get to key, its block1.block2.block3.key
 *
 *  If I am block1, I see block2.block3.key for the path to fulfil
 *  If I am block2, I see block3.key for the path to fulfil
 *  If I am block3, I see key for the path to fulfil
 *
 * Created by lloyd on 19/10/2015.
 */
public class Block {

    private Key key = null;
    private List<Block> children = new ArrayList<>();
    private Map<Key, Rule> rules = new HashMap<>();

    public Key getKey() {
        return key;
    }

    public String getValue(Queue<String> pathBits, Configuration root) throws InvalidKeyException {
        if(pathBits.size() == 0){
            throw new InvalidKeyException("We could not resolve the key. Key ended in a Block");
        }
        String toFulfil = pathBits.remove();

        //If this was the last path bit, THEN it must match a rule, otherwise it MUST match a block
        if(pathBits.size() == 0){
            for(Key k : rules.keySet()){
                if(k.matches(toFulfil)){
                    return rules.get(key).resolve(root);
                }
            }
            throw new InvalidKeyException(String.format("We could not resolve the given key. No rules match the key's name %s", toFulfil));
        } else {
            for (Block p : children) {
                if (p.getKey().matches(toFulfil)) {
                    return p.getValue(pathBits, root);
                }
            }
            throw new InvalidKeyException(String.format("We could not resolve the given key. No child blocks match the keys name: %s", toFulfil));
        }
    }
}
