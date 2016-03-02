package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sparky.model.Configuration;
import org.sparky.model.ExternProvider;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.model.exceptions.InvalidKeyException;
import org.sparky.parser.SparkyLexer;
import org.sparky.parser.SparkyLexerFixed;
import org.sparky.parser.SparkyParser;
import org.sparky.parser.SparkyVistorImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ConfigurationTester {
    public static class KeyValue {
        private final String key;
        private final String value;

        public KeyValue(String key, String value) {
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

    public Map<List<KeyValue>, List<KeyValue>> getTestsInFile(){
        Map<List<KeyValue>, List<KeyValue>> tests = new HashMap<>();

        File f = new File(file.getAbsolutePath() + ".expectations");
        if(!f.exists()){
            throw new IllegalStateException("Could not file .expectations file for input file of:" + file.getAbsolutePath());
        }

        List<String> rows = new ArrayList<>();
        List<KeyValue> expectations = new ArrayList<>();
        List<KeyValue> externals = new ArrayList<>();

        try {
            rows = Files.readAllLines(f.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String row : rows){
            if(row.startsWith("WHEN:")){
                if(expectations.size() > 0){
                    tests.put(externals, expectations);
                    externals = new ArrayList<>();
                    expectations = new ArrayList<>();
                }
                String[] bits = row.replace("WHEN:", "").split("=");
                externals.add(new KeyValue(bits[0], bits[1]));
            } else if (!row.isEmpty()) {
                String[] bits = row.split("=");
                expectations.add(new KeyValue(bits[0], bits[1]));
            }
        }

        tests.put(externals, expectations);
        return tests;
    }

    @Test
    public void execute() throws InvalidKeyException {
        Configuration config = (new ConfigurationBuilder().withFile(file.getAbsolutePath()).build());

        Map<List<KeyValue>, List<KeyValue>> tests = getTestsInFile();

        for(List<KeyValue> externs : tests.keySet()) {
            for(KeyValue extern : externs){
                ((MapExternProvider)config.getExternProvider()).setExtern(extern.getKey(), extern.getValue());
            }
            for (KeyValue toTest : tests.get(externs)) {

                    assertEquals(toTest.getValue(), config.get(toTest.getKey()));
                    System.out.println(String.format("SUCCESS: Checking '%s' evaluates to '%s'", toTest.getKey(), toTest.getValue()));

            }
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
