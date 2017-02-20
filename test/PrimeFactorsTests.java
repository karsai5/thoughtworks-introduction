import main.PrimeFactors;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by linus on 20/2/17.
 */
public class PrimeFactorsTests {
    // used for checking output of System.out.println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    PrimeFactors fp;

    @Before
    public void setUpStreams() {
        // create new prime factors
        fp = new PrimeFactors();
        // reset streams for checking output
        resetStreams();
    }

    @After
    public void cleanUpStreams() {
        // remove streams for checking output
        System.setOut(null);
        System.setErr(null);
    }

    public void resetStreams() {
        // create streams for checking output
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        outContent.reset();
        errContent.reset();
    }

    @Test
    public void genetrate_for_one(){
        fp.print(1);
        assertEquals("\n", outContent.toString());
    }

    @Test
    public void generate_for_thirty() {
        fp.print(30);
        assertEquals("1, 2, 3, 5, 6, 10, 15\n", outContent.toString());
    }
}
