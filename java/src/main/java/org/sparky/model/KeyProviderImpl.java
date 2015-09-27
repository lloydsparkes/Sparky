package org.sparky.model;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * TODO: Write a comment here
 */
public class KeyProviderImpl implements  KeyProvider {

    private final Map<String, String> externalVariables = new HashMap<>();
    private final Map<String, KeyProvider> configuration = new HashMap<>();

    @Override
    public KeyProvider but(String externalKey, String newValue) {
        return null;
    }

    @Override
    public String getValue(String key) {
        return null;
    }

    @Override
    public List<String> getKeys() {
        return null;
    }

    @Override
    public List<String> getKeys(String path) {
        return null;
    }
}
