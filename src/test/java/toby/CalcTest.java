package toby;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdding() {
		double result = Calc.calculate('+', 5, 8);
		assertEquals(13.0, result, 0.001);
	}
	
	@Test
	public void testSubtracting() {
		double result = Calc.calculate('-', 10, 8);
		assertEquals(2.0, result, 0.001);
	}

	@Test
	public void testMultiplying() {
		double result = Calc.calculate('x', 7, 7);
		assertEquals(49.0, result, 0.001);
	}
	
	@Test
	public void testDiving() {
		double result = Calc.calculate('/', 10, 2);
		assertEquals(5.0, result, 0.001);
	}
}
