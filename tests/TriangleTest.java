import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;


public class TriangleTest {

    Triangle shape = new Triangle();

    @Test
    public void easiestExercise_PrintsAnAsterisk() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shape.easiestExercise();
        assertEquals("*", outContent.toString());
    }

    @Test
    public void horizontalLine_DrawsLineOfLengthTen() {
        assertEquals("**********", shape.horizontalLine(10));
    }

    @Test
    public void verticalLine_DrawsLineOfLengthFive() {
        assertEquals("*\n*\n*\n*\n*", shape.verticalLine(5));
    }

    @Test
    public void rightTriangle_DrawsRightTriangleHeightThree() {
        assertEquals("*\n**\n***", shape.rightTriangle(3));
    }

    @Test
    public void isosceles_DrawsIsoscelesHeightFour() {
        assertEquals("   *   \n  ***  \n ***** \n*******", shape.isosceles(4));
    }

    @Test
    public void diamond_DrawsDiamondHeightThree() {
        assertEquals("  *  \n *** \n*****\n *** \n  *  ", shape.diamond(3));
    }

    @Test
    public void diamondWithName_DrawsDiamondHeightThreeAndPrintsNameAlfred() {
        assertEquals("  *  \n *** \nAlfred\n *** \n  *  ", shape.diamondWithName(3, "Alfred"));
    }
}