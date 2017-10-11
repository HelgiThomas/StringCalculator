package is.ru.hugb;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

	@Test
	public void testEmptyString() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.add(""));
	}

	@Test
	public void testOneNumbers() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.add("5"));
	}

	@Test
	public void testTwoNumbers() {
		Calculator calc = new Calculator();
		assertEquals(3, calc.add("1,2"));
	}

}