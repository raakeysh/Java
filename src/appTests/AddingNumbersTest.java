package appTests;

import org.junit.Assert;
import org.junit.Test;

import source.Calculator;
public class AddingNumbersTest {
	Calculator myCalculator = new Calculator();
	
	@Test
	public void addTwoPositiveNumbers()
	{
		int expected = 30;
		int actual = myCalculator.add(10,20);
		Assert.assertEquals("The sum of two positive numbers is not correct:", expected, actual);
	}
	
	@Test
	public void addTwoNegativeNumbers()
	{
		int expected = -50;
		int actual = myCalculator.add(-20, -30);
		Assert.assertEquals("Sum of two numbers is not correct", expected, actual);
	}

}
