package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.model.builders.ConfigurationBuilder;
import org.sparky.parser.*;

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
        ConfigurationBuilder built = walker.visit(ps.config());


    }
}
