import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.List;

/**
 * A number of tester methods useful in diagnosing issues
 *
 */
public class SparkyTester{
    public static void main(String[] args) throws IOException {
        ANTLRFileStream fs = new ANTLRFileStream("D:\\Projects\\Sparky\\examples\\sample.sparky");
        SparkyLexer lexer = new SparkyLexer(fs);

        List<? extends Token> tokens = lexer.getAllTokens();
        int iToken = 0;
        for(Token t : tokens){
            System.out.format("%6d: %4d.%3d: T%3d C%3d; '%s'%n",
                    iToken,
                    t.getLine(), t.getCharPositionInLine(),
                    t.getType(), t.getChannel(),
                    t.getText());
            iToken++;
        }
    }
}
