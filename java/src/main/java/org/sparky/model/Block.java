package org.sparky.model;

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
public class Block implements ValueProvider {

    private Block parent;
    private String name;
    private List<ValueProvider> children = new ArrayList<>();
    private Table table = null;

    @Override
    public boolean willResolve(String pathBit) {
        return false;
    }

    @Override
    public String getValue(Queue<String> pathBits, ValueProvider rootProvider) {
        if(pathBits.peek() == null){
            throw new RuntimeException("We have finished traversing the key provided, but we found a block, not a value");
        }
        String toFulfil = pathBits.remove();

        for(ValueProvider p : children){
            /**if(p.getKey().willResolve(toFulfil)){
                return p.getValue(pathBits, rootProvider);
            }**/
        }
        return null;
    }

    @Override
    public Collection<String> getKeys(ValueProvider rootProvider) {
        return null;
    }

    @Override
    public Collection<String> getKeys(Queue<String> pathBits, ValueProvider rootProvider) {
        return null;
    }
}
