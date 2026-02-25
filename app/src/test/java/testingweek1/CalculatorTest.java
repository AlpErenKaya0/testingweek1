package testingweek1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    
    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(1, calculator.add(7, 3), "7 + 3 should equal 10");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(10, 6), "10 - 6 should equal 4");
    }
}