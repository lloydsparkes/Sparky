package org.sparky.model;

import org.sparky.model.exceptions.InvalidKeyException;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Provides access to the Configuration
 *
 * Created by lloyd on 20/10/2015.
 */
public class Configuration {

    private Map<String, String> externs = new HashMap<>();
    private Block root;

    public String get(String key) throws InvalidKeyException {
        String[] pathBits = key.split(".");

        if(pathBits.length == 1){
            //Do we have an external key?
            if(pathBits[0].toUpperCase().equals(pathBits[0])) {
                return getExternalVariable(pathBits[0]);
            }
        }

        Queue<String> pathQ = new ArrayDeque<>();
        for(String s : pathBits){
            pathQ.add(s);
        }

        return root.getValue(pathQ, this);
    }

    private String getExternalVariable(String key) throws InvalidKeyException {
        if(externs.containsKey(key)){
            return externs.get(key);
        }
        throw new InvalidKeyException(String.format("Could not find an external key %s", key));
    }
}
