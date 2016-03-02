package org.sparky;

import org.sparky.model.ExternProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lloyd on 02/03/2016.
 */
public class MapExternProvider implements ExternProvider {

    private Map<String,String> externs = new HashMap<>();

    public MapExternProvider() { }
    public MapExternProvider(Map<String, String> externs){

    }

    @Override
    public String getExtern(String key) {
        return externs.get(key);
    }

    @Override
    public boolean hasExtern(String key) {
        return externs.containsKey(key);
    }

    public void setExtern(String key, String value){
        externs.put(key, value);
    }
}
