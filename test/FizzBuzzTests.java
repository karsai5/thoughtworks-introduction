import main.FizzBuzz;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by linus on 20/2/17.
 */
public class FizzBuzzTests {
    // used for checking output of System.out.println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    FizzBuzz fb;

    @Before
    public void setUpStreams() {
        // create new triangle
        fb = new FizzBuzz();
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
    public void count_to_three() {
        fb.printCount(3);
        assertEquals("1\n2\nFizz\n", outContent.toString());
    }

    @Test
    public void count_to_five() {
        fb.printCount(5);
        assertEquals("1\n2\nFizz\n4\nBuzz\n", outContent.toString());
    }

    @Test
    public void count_to_fifteen() {
        fb.printCount(15);
        assertEquals("1\n" + "2\n" + "Fizz\n" + "4\n" + "Buzz\n" + "Fizz\n" + "7\n" + "8\n" + "Fizz\n" +
                "Buzz\n" + "11\n" + "Fizz\n" + "13\n" + "14\n" + "main.FizzBuzz\n", outContent.toString());
    }

}
