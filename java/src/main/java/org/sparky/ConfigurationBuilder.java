package org.sparky;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sparky.model.Configuration;
import org.sparky.model.builders.BlockBuilder;
import org.sparky.parser.SparkyLexerFixed;
import org.sparky.parser.SparkyParser;
import org.sparky.parser.SparkyVistorImpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lloyd on 01/03/2016.
 */
public class ConfigurationBuilder {
    private List<String> files = new ArrayList<>();
    private List<String> directories = new ArrayList<>();

    public ConfigurationBuilder withFile(String file){
        files.add(file);
        return this;
    }

    public ConfigurationBuilder withDirectory(String directory){
        directories.add(directory);
        return this;
    }

    public Configuration build(){
        List<String> toProcess = new ArrayList<>();

        for(String dir : directories){
            File f = new File(dir);

            if(f.exists()){
                if(f.isDirectory()){
                    for(File child : f.listFiles()){
                        toProcess.add(child.getAbsolutePath());
                    }
                } else {
                    toProcess.add(dir); //Actually a file
                }
            } else {
                //TODO: Throw Error / Logging
            }
        }

        for(String file : files){
            File f = new File(file);
            if(f.exists()){
                toProcess.add(file);
            } else {
                //TODO: Throw Error / Logging
            }
        }

        BlockBuilder builder = new BlockBuilder();

        for(String file : toProcess){
            loadFile(builder, file);
        }

        return new Configuration(builder.build(null));
    }

    private void loadFile(BlockBuilder builder, String file) {
        try {
            //Yes this is bad, but I want to use the shared examples so all platforms utilise them.
            ANTLRFileStream fs = new ANTLRFileStream(file);
            SparkyLexerFixed lexer = new SparkyLexerFixed(fs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //TODO: Set Error Handler
            SparkyParser ps = new SparkyParser(tokens);

            SparkyVistorImpl walker = new SparkyVistorImpl(builder);
            BlockBuilder built = (BlockBuilder) walker.visit(ps.config());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
