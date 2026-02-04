import static org.junit.Assert.*;
import org.junit.*;


public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testSuma() {
        assertEquals(5.0, calc.operate("2 3 +"), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.operate("6 3 /"), 0.001);
    }
}
