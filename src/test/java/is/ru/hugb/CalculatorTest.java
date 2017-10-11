package is.ru.hugb;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

	@Test
	public void testEmptyString() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.add(""));
	}
}