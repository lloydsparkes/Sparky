package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.sparky.model.Configuration;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.model.exceptions.InvalidKeyException;
import org.sparky.parser.SparkyLexer;
import org.sparky.parser.SparkyParser;
import org.sparky.parser.SparkyVistorImpl;

import java.io.IOException;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ConfigurationTester {

    public static Configuration getConfiguration(){
        try {

            //Yes this is bad, but I want to use the shared examples so all platforms utilise them.
            ANTLRFileStream fs = new ANTLRFileStream("D:\\Projects\\Sparky\\examples\\sample.sparky");
            SparkyLexer lexer = new SparkyLexer(fs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //TODO: Set Error Handler
            SparkyParser ps = new SparkyParser(tokens);

            SparkyVistorImpl walker = new SparkyVistorImpl();
            BlockBuilder built = (BlockBuilder) walker.visit(ps.config());

            return new Configuration(built.build());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test_overrideKeys() throws InvalidKeyException {
        Configuration config = getConfiguration();

        assertNotNull(config);

        assertEquals("Expected database.server.user to be 'lloyd'", "lloyd", config.get("database.server.user"));
    }

}
