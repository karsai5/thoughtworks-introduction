import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by linus on 20/2/17.
 */

public class ShapeTests {
    // used for checking output of System.out.println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    Shape s;

    @Before
    public void setUpStreams() {
        // create new triangle
        s = new Shape();
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
    public void print_single_asterisk() {
        s.printAsterisk();
        assertEquals("*\n", outContent.toString());
    }

    @Test
    public void print_horizontal_line() {
        s.printHorizontalLine(0);
        assertEquals("\n", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printHorizontalLine(8);
        assertEquals("********\n", outContent.toString());
    }

    @Test
    public void print_vertical_line() {
        s.printVerticalLine(0);
        assertEquals("", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printVerticalLine(3);
        assertEquals("*\n*\n*\n", outContent.toString());
    }

    @Test
    public void print_right_triangle() {
        s.printRightTriangle(0);
        assertEquals("", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printRightTriangle(3);
        assertEquals("*\n**\n***\n", outContent.toString());
    }

    @Test
    public void print_isosceles_triangle() {
        s.printIsoscelesTriangle(0);
        assertEquals("", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printIsoscelesTriangle(3);
        assertEquals("  *\n ***\n*****\n", outContent.toString());
    }

    @Test
    public void print_diamond() {
        s.printDiamond(0);
        assertEquals("", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printDiamond(3);
        assertEquals("  *\n ***\n*****\n ***\n  *\n", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printDiamond(1);
        assertEquals("*\n", outContent.toString());
    }

    @Test
    public void print_diamond_with_name() {
        s.printDiamondWithName(0,"Bill");
        assertEquals("Bill\n", outContent.toString());

        resetStreams(); // does this to get a frest system.out.println

        s.printDiamondWithName(3, "Bill");
        assertEquals("  *\n ***\nBill\n ***\n  *\n", outContent.toString());
    }

}
