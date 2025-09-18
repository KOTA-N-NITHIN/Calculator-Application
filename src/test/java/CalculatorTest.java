import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(10.0, Calculator.add(6, 4), 0.0001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, Calculator.subtract(6, 4), 0.0001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(24.0, Calculator.multiply(6, 4), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(1.5, Calculator.divide(6, 4), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        double result = Calculator.divide(6, 0);
        assertEquals(0.0, result, 0.0001); // your divide() method returns 0 on error
    }
}
