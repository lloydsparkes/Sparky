package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sparky.model.Configuration;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.model.exceptions.InvalidKeyException;
import org.sparky.parser.SparkyLexer;
import org.sparky.parser.SparkyParser;
import org.sparky.parser.SparkyVistorImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ConfigurationTester {
    public static class Expectation{
        private final String key;
        private final String value;

        public Expectation(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    private final File file;

    public ConfigurationTester(File file, String name){
        this.file = file;
    }

    public Configuration getConfiguration(){
        try {
            //Yes this is bad, but I want to use the shared examples so all platforms utilise them.
            ANTLRFileStream fs = new ANTLRFileStream(file.getAbsolutePath());
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

    public List<Expectation> getExpectations(){
        File f = new File(file.getAbsolutePath() + ".expectations");
        if(!f.exists()){
            throw new IllegalStateException("Could not file .expectations file for input file of:" + file.getAbsolutePath());
        }

        List<String> rows = new ArrayList<>();
        List<Expectation> expectations = new ArrayList<>();

        try {
            rows = Files.readAllLines(f.toPath());
        } catch (IOException e) {

        }

        for(String row : rows){
            String[] bits = row.split("=");
            expectations.add(new Expectation(bits[0], bits[1]));
        }

        return expectations;
    }

    @Test
    public void execute() throws InvalidKeyException {
        Configuration config = getConfiguration();
        List<Expectation> expectations = getExpectations();

        for(Expectation e : expectations){
            System.out.println(String.format("Checking %s evaluates to %s", e.getKey(), e.getValue()));
            assertEquals(e.getValue(), config.get(e.getKey()));
        }
    }

    @Parameterized.Parameters(name = "ConfigurationTest_{1}")
    public static Collection<Object[]> data(){
        Collection<Object[]> data = new ArrayList<Object[]>();

        File baseDir = new File("D:\\Projects\\Sparky\\examples");
        for(File f : baseDir.listFiles()){
            if(!f.getAbsolutePath().contains(".expectations")){
                data.add(new Object[] { f, f.getName() } );
            }
        }

        return data;
    }
}
