/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
package demo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/* You need to fill in the blanks */

public class DemoTest {

	@Test
	public void test_is_Triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}


   @Test
   public void mainTest1() {

   }

}
