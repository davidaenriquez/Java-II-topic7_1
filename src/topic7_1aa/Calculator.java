package topic7_1aa;

/**
 * The `Calculator` class represents a simple calculator with basic arithmetic operations.
 * It includes methods for addition, subtraction, multiplication, and division.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class Calculator {
	
	/**
	 * Adds two integers.
	 *
	 * @param a The first integer.
	 * @param b The second integer.
	 * @return The sum of the two integers.
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	/**
	 * Subtracts one integer from another.
	 *
	 * @param a The minuend.
	 * @param b The subtrahend.
	 * @return The result of the subtraction.
	 */
	public int subtract(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplies two integers.
	 *
	 * @param a The first integer.
	 * @param b The second integer.
	 * @return The product of the two integers.
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
	
	/**
	 * Divides one integer by another.
	 *
	 * @param a The dividend.
	 * @param b The divisor (should not be zero).
	 * @return The result of the division.
	 */
	public int divide(int a, int b) {
		return a / b;
	}

	/**
	 * Main method for testing the Calculator class.
	 *
	 * @param args Command-line arguments (not used in this case).
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Adding 1 + 2 is " + calc.add(1, 2));
		System.out.println("Subtracting 2 from 1 is " + calc.subtract(2, 1));
		System.out.println("Multiplication of 10 and 2 is " + calc.multiply(10, 2));
		System.out.println("Division of 10 by 2 is " + calc.divide(10, 2));
	}
}