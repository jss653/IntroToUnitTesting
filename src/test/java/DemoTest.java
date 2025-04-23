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

public class DemoTest {

	@Test
	public void test_is_Triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}

	@Test
	public void test_is_Triangle_2() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}

	@Test
	public void test_is_Triangle_3() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}

	@Test
	public void test_is_Triangle_4() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}

	@Test
	public void test_is_Triangle_5() {
		assertFalse(Demo.isTriangle(0, 0, 0));
	}

	@Test
	public void test_is_Triangle_6() {
		assertTrue(Demo.isTriangle(3, 3, 5));
	}

   @Test
   public void mainTest1() {

		ByteArrayInputStream in =
			new ByteArrayInputStream("5\n12\n13\n".getBytes());

		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		System.setOut(new PrintStream(out));

		String[] args = {"5,12,13"};
		Demo.main(args);

		String consoleOutput = "Enter side 1: \n";
		consoleOutput += "Enter side 2: \n";
		consoleOutput += "Enter side 3: \n";
		consoleOutput += "This is a triangle.\n";

		assertEquals(consoleOutput, out.toString());
   }
   @Test
   public void mainTest2() {

		ByteArrayInputStream in =
			new ByteArrayInputStream("0\n0\n0\n".getBytes());

		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		System.setOut(new PrintStream(out));

		String[] args = {"0,0,0"};
		Demo.main(args);

		String consoleOutput = "Enter side 1: \n";
		consoleOutput += "Enter side 2: \n";
		consoleOutput += "Enter side 3: \n";
		consoleOutput += "This is not a triangle.\n";

		assertEquals(consoleOutput, out.toString());
   }

}
