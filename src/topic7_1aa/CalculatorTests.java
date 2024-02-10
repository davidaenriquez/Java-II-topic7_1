package topic7_1aa;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTests {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(3, calc.add(2, 1));
		assertEquals(7, calc.add(2, 5));
	}

	@Test
	public void testSubstract() {
		Calculator calc = new Calculator();
		assertEquals(1, calc.substract(2, 1));
		assertEquals(3, calc.substract(5, 2));
	}

	@Test 
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.multiply(2, 1));
		assertEquals(10, calc.multiply(5, 2));
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.divide(2, 1));
		assertEquals(2, calc.divide(5, 2));
	}

}
