package topic7_1aa;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
/**
 * The `CalculatorTests` class contains parameterized tests for the `Calculator` class.
 * It tests different arithmetic operations (addition, subtraction, multiplication, division)
 * with various input values.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class CalculatorTests {
	
	enum Type {ADD, SUBTRACT, MULTIPLY, DIVIDE};
	
	@SuppressWarnings("exports")
	@Parameter(0)
	public Type type;
	@Parameter(1)
	public int a1;
	@Parameter(2)
	public int a2;
	@Parameter(3)
	public int result;
	
	/**
	 * Provides data for parameterized tests.
	 *
	 * @return Collection of test data arrays.
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object [][] {
			{Type.ADD, 2, 1, 3},
			{Type.ADD, 5, 2, 7},
			{Type.SUBTRACT, 2, 1, 1},
			{Type.SUBTRACT, 5, 2, 3},
			{Type.MULTIPLY, 2, 1, 1},
			{Type.MULTIPLY, 5, 2, 10},
			{Type.DIVIDE, 2, 1, 1},
			{Type.DIVIDE, 5, 2, 2}
		};
		return Arrays.asList(data);
	}
	
	/**
	 * Parameterized test for addition.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		Assume.assumeTrue(type == Type.ADD);
		Calculator calc = new Calculator();
		assertEquals(result, calc.add(a1, a2));
	}
	
	/**
	 * Parameterized test for subtraction.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtract() {
		Assume.assumeTrue(type == Type.SUBTRACT);
		Calculator calc = new Calculator();
		assertEquals(result, calc.subtract(a1, a2));
	}
	
	/**
	 * Parameterized test for multiplication.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testMultiply() {
		Assume.assumeTrue(type == Type.MULTIPLY);
		Calculator calc = new Calculator();
		assertEquals(result, calc.multiply(a1, a2));
	}
	
	/**
	 * Parameterized test for division.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testDivide() {
		Assume.assumeTrue(type == Type.DIVIDE);
		Calculator calc = new Calculator();
		assertEquals(result, calc.divide(a1, a2));
	}
}