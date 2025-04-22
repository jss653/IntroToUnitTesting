/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
package demo;

import static org.junit.Assert.*;
import org.junit.Test;


public class DemoTest {

	@Test
	public void test_is_Triangle_1() {
		//assertTrue(true);
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
}
