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

	@Test
	public void testMultipleNumbers() {
		Calculator calc = new Calculator();
		assertEquals(27,calc.add("2,3,4,5,6,7"));
	}

	@Test
	public void testNewLine() {
		Calculator calc = new Calculator();
		assertEquals(6,calc.add("1\n2,3"));
	}
	
	@Test
	public void testNegativeNumber() {
		Calculator calc = new Calculator();
		try {
			calc.add("2,-4,3,-5,-6\n-7");
		}
		catch (RuntimeException ex) {
			assertEquals("Negatives not allowed: -4,-5,-6,-7", ex.getMessage());
		}
	}

	@Test 
	public void testBigNumber() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.add("1001"));
		assertEquals(2,calc.add("2,1001"));
	}

}