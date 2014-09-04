package edu.msg.helloTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.msg.helloMaven.Calculator;

public class CalculatorTest2 {

	
	

	@Test
	public void testAdd() {
		assertEquals(Calculator.add(1,2),3);
	}

	@Test
	public void testSub() {
		assertEquals(Calculator.sub(3,2),1);
	}

	@Test
	public void testMul() {
		assertEquals(Calculator.mul(2,2),4);
	}

	@Test
	public void testDiv() {
		assertEquals(Calculator.div(1,2),0.5,0.00001);
	}

	@Test
	public void testMod() {
		assertEquals(Calculator.mod(1,2),1);
	}
	
}
