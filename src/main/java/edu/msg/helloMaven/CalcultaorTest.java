package edu.msg.helloMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcultaorTest {
	
	
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
		assertEquals(Calculator.mul(1,2),2);
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
