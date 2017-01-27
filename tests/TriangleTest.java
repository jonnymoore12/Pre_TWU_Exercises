import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void easiestExercise_PrintsAnAsterisk() {
        assertEquals("*", triangle.easiestExercise());
    }
}