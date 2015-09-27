package org.sparky.model;

import java.util.List;

/**
 * Provides readonly methods to access the configuration
 *
 * Threadsafe - Hopefully it is, no state should be modified
 */
public interface KeyProvider {

    /**
     * Overrides an external variable, returning a new KeyProvider which uses the overridden value
     *
     * @param externalKey - the external key to override, must be an all caps
     * @param newValue - the new value to replace this key with
     * @return - a new KeyProvider with the appropriate value changed
     */
    KeyProvider but(String externalKey, String newValue);

    /**
     * Finds the value for a given key
     * @param key
     * @return
     */
    String getValue(String key);

    /**
     * Get all keys that we can provide
     * @return
     */
    List<String> getKeys();

    /**
     * Gets all keys that we can provide under a given path
     * @param path
     * @return
     */
    List<String> getKeys(String path);
}
