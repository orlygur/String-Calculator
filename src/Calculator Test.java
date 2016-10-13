package String-Calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.Add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.Add("1"));
	}
	
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.Add("1,2"));
	}
	
	@Test
	public void testThreeNumbers() {
		assertEquals(6, Calculator.Add("1,2,3"));
	}
	
	@Test
	public void testFourNumbers() {
		assertEquals(10, Calculator.Add("1,2,3,4"));
	}
}