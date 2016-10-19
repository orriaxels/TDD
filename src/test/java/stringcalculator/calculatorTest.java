package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.hamcrest.Matcher;


public class CalculatorTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

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

	@Test
	public void testMultipleNumbers()
	{
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testNewline()
	{
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegative()
	{
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Negatives not allowed: -5");
		Calculator.add("-5,7");
	}

	@Test
	public void testLarge()
	{
		assertEquals(2, Calculator.add("2,10000"));
	}

	@Test
	public void testDelim()
	{
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

}