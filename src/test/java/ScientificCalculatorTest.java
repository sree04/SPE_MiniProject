import org.example.ScientificCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ScientificCalculatorTest {
    ScientificCalculator ob = new ScientificCalculator();


    @Test
    public void testSquareRoot() {
        assertEquals(2.0, ob.squareRoot(4),0);
        assertEquals(5.0, ob.squareRoot(25),0);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ob.factorial(5),0);
        assertEquals(1, ob.factorial(0),0);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, ob.naturalLog(1),0);
        assertEquals(2.0, ob.naturalLog(Math.E * Math.E), 0);
    }

    @Test
    public void testPower() {
        assertEquals(16.0, ob.power(4, 2),0);
        assertEquals(8.0, ob.power(2, 3),0);
        assertEquals(1.0, ob.power(5, 0),0);
    }
}

