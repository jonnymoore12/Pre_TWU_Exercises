import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PrimeFactorsTest {
    PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void generate_NEqualsOneReturnsAnEmptyList() {
        List<Integer> primeFactors1 = Arrays.asList();
        assertEquals(primeFactors1, primeFactors.generate(1));
    }

    @Test
    public void generate_NEqualsThirtyReturnsTwoThreeAndFive() {
        List<Integer> primeFactors30 = Arrays.asList(2,3,5);
        assertEquals(primeFactors30, primeFactors.generate(30));
    }
}