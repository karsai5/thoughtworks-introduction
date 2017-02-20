import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by linus on 20/2/17.
 */

public class TriangleTest {
    // used for checking output of System.out.println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        // create streams for checking output
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        // remove streams for checking output
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void print_single_asterisk() {
        Triangle t = new Triangle();
        t.printAsterisk();
        assertEquals("*\n", outContent.toString());
    }

}
