package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sparky.model.Block;
import org.sparky.model.Configuration;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.model.exceptions.InvalidKeyException;
import org.sparky.parser.SparkyLexer;
import org.sparky.parser.SparkyParser;
import org.sparky.parser.SparkyVistorImpl;

import java.io.IOException;

/**
 * A number of tester methods useful in diagnosing issues
 *
 */
public class SparkyTester{

    public static void main(String[] args) throws IOException, InvalidKeyException {
        ANTLRFileStream fs = new ANTLRFileStream("D:\\Projects\\Sparky\\examples\\sample.sparky");
        SparkyLexer lexer = new SparkyLexer(fs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //TODO: Set Error Handler
        SparkyParser ps = new SparkyParser(tokens);

        SparkyVistorImpl walker = new SparkyVistorImpl();
        BlockBuilder built = (BlockBuilder)walker.visit(ps.config());

        Configuration c = new Configuration(built.build());

        System.out.println("Database Username: " + c.get("database.server.user"));
    }
}
