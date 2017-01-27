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
    public void verticalLine_DrawsLineofLengthFive() throws Exception {
        assertEquals("*\n*\n*\n*\n*", shape.verticalLine(5));
    }

    @Test
    public void rightTriangle_DrawsRightTriangleHeightThree() throws Exception {
        assertEquals("*\n**\n***", shape.rightTriangle(3));
    }

    @Test
    public void isosceles_DrawsIsoscelesHeightFour() throws Exception {
        assertEquals("   *   \n  ***  \n ***** \n*******", shape.isosceles(4));
    }
}