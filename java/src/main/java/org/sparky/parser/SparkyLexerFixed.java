package org.sparky.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

/**
 * Use this not the SparkyLexer as it contains the key overrides to make the Dentation work correctly
 */
public class SparkyLexerFixed extends SparkyLexer {
    public SparkyLexerFixed(CharStream input) {
        super(input);
    }

    private final SparkyIndentationHelper denter = SparkyIndentationHelper.builder()
            .nl(NL)
            .indent(SparkyParser.INDENT)
            .dedent(SparkyParser.DEDENT)
            .pullToken(SparkyLexerFixed.super::nextToken);

    @Override
    public Token nextToken() {
        return denter.nextToken();
    }
}
