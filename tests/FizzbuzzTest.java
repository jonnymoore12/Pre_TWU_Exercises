import org.junit.Test;
import static org.junit.Assert.*;


public class FizzbuzzTest {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void evaluate_ReturnsFizzForMultiplesOfThree() {
        assertEquals("fizz", fizzbuzz.evaluate(3));
    }

    @Test
    public void evaluate_ReturnsBuzzForMultiplesOfFive() {
        assertEquals("buzz", fizzbuzz.evaluate(5));
    }

    @Test
    public void evaluate_ReturnsFizzbuzzForMultiplesOfThreeAndFive() {
        assertEquals("fizzbuzz", fizzbuzz.evaluate(15));
    }

    @Test
    public void evaluate_ReturnsOriginalNumberIfNumberNotMulitpleOfThreeOrFive() throws Exception {
        assertEquals(1, fizzbuzz.evaluate(1));
    }
}