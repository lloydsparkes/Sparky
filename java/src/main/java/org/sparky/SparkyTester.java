package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sparky.model.Block;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.parser.SparkyLexer;
import org.sparky.parser.SparkyParser;
import org.sparky.parser.SparkyVistorImpl;

import java.io.IOException;

/**
 * A number of tester methods useful in diagnosing issues
 *
 */
public class SparkyTester{

    public static void main(String[] args) throws IOException {
        ANTLRFileStream fs = new ANTLRFileStream("D:\\Projects\\Sparky\\examples\\sample.sparky");
        SparkyLexer lexer = new SparkyLexer(fs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //TODO: Set Error Handler
        SparkyParser ps = new SparkyParser(tokens);

        SparkyVistorImpl walker = new SparkyVistorImpl();
        BlockBuilder built = (BlockBuilder)walker.visit(ps.config());

        Block configuration = built.build();
    }
}
