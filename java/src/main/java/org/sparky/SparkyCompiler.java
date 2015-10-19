package org.sparky;

import java.util.Map;

/**
 * The main compiler for Sparky, turns a set of configuartion files into a hash map of key to value pairs.
 *
 * Created by lloyd on 26/09/2015.
 */
public class SparkyCompiler {

    /**
     * How the Compiler should work - just idea's
     *
     * Idea's:
     *  Values are generated on demand
     *  As little as possible is provided for
     *
     * 0. While walking the tree, ensure as much token information is retained so that error messages can be sensible
     * 1. Walk the tree, translating the tree, to more flexible object model.
     *  a. During this stage, extract all external variables required
     *      i. Provide a a ExternalVariable provider interface an default provider
     *  b. Manipulate tables
     *      a. Tables will be represented with a hypercube / OLAP cube
     *          Where tables are shared with sub blocks, they will be wrapped with a Reducer
     *          To reduce the values that they have access to, BUT if a filter is changed, they can still benefit from this
     *
     *
     *  The new object model is effectively a wrapper around nested hashmaps
     *
     *      class Configuration implements ValueProvider {
     *          HashMap{BlockName, BlockContent} _internal;
     *
     *          Configuration but(externalKey, newValue); //For overriding
     *          String getValue(keyname);
     *          String[] getKeys();
     *      }
     *
     *
     */


}
