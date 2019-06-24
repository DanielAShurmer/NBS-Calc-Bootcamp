package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTwoNumbersTogether_Test() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void multiplyTwoNumbersTogether_Test() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(3,4);
		Assert.assertEquals(12, result);
	}
	
	@Test
	public void divideTwoNumbers_Test() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(18,2);
		Assert.assertEquals(9, result);
	}
}