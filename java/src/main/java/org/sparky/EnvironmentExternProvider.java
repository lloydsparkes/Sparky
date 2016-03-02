package org.sparky;

import org.sparky.model.ExternProvider;

/**
 * Created by lloyd on 02/03/2016.
 */
public class EnvironmentExternProvider implements ExternProvider{

    @Override
    public String getExtern(String key) {
        return System.getenv(key);
    }

    @Override
    public boolean hasExtern(String key) {
        return System.getenv(key) != null;
    }
}
