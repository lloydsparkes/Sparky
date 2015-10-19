package org.sparky.model.builders;

import org.sparky.model.ValueProvider;

/**
 * Created by lloyd on 17/10/2015.
 */
public interface ConfigurationBuilder {

    abstract ValueProvider build(ConfigurationBuilder parent);
}
