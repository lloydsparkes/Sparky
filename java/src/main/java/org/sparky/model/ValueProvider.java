package org.sparky.model;

import java.util.Collection;
import java.util.List;
import java.util.Queue;

/**
 * Provides readonly methods to access the configuration
 *
 * Threadsafe - Hopefully it is, no state should be modified
 */
public interface ValueProvider {

    /**
     * Will respond True if it can resolve to the value given by the path bits
     * @return key - the Key for the value provider
     */
    Key getKey();

    /**
     * Finds the value for a given key
     * @param pathBits - a broken down key
     * @return
     */
    String getValue(Queue<String> pathBits, ValueProvider rootProvider);

    /**
     * Get all keys that we can provide
     * @return
     */
    Collection<String> getKeys(ValueProvider rootProvider);

    /**
     * Gets all keys that we can provide under a given path
     * @param pathBits - a broken down key
     * @return
     */
    Collection<String> getKeys(Queue<String> pathBits, ValueProvider rootProvider);
}
