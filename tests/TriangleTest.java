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
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        triangle.horizontalLine(10);
        assertEquals("**********", outContent.toString());
    }

}