import org.junit.Test;
import java.io.*;

import static org.junit.Assert.*;


public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void easiestExercise_PrintsAnAsterisk() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        triangle.easiestExercise();
        assertEquals("*", outContent.toString());
    }

    @Test
    public void horizontalLine_PrintsLineOfLengthTen() {
        assertEquals("**********", triangle.horizontalLine(10));
    }

    @Test
    public void verticalLine_ReturnsALineofLengthFive() throws Exception {
        assertEquals("*\n*\n*\n*\n*\n", triangle.verticalLine(5));
    }

}