package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() 
	{
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testOneStrings()
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoStrings()
	{
		assertEquals(3, Calculator.add("1,2"));
	}
}