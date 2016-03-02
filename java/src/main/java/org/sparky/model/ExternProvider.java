package org.sparky.model;

/**
 * Created by lloyd on 02/03/2016.
 */
public interface ExternProvider {

    String getExtern(String key);

    boolean hasExtern(String key);
}
