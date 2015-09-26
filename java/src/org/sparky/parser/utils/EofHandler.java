package org.sparky.parser.utils;

import org.antlr.v4.runtime.Token;

/**
 * Created by lloyd on 26/09/2015.
 */
public interface EofHandler {
    Token apply(Token t);
}
