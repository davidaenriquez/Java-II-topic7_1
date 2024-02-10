package topic7_1aa;

/**
 * The `AllTests` class is a JUnit test suite that runs all the tests
 * included in the `CalculatorTests` class.
 *
 * @see CalculatorTests
 * @author [Your Name]
 * @version 1.0
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTests.class })
public class AllTests {

}