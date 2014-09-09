package edu.msg.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.msg.fixtures.CreateCalculations;

public class CalculatorTest2 {

	private CreateCalculations calc;
	
	@Test
	public void testAdd() {
		calc=new CreateCalculations();
		calc.setOperand1(1);
		calc.setOperand2(2);
		calc.setOperation("Add");
		assertEquals(calc.result(), 3,0.00001);
	}

	@Test
	public void testAddNegativ() {
		
		calc=new CreateCalculations();
		calc.setOperand1(1);
		calc.setOperand2(-2);
		calc.setOperation("Add");
		assertEquals(calc.result(), -1,0.00001);
	}

	@Test
	public void testSub() {
		calc=new CreateCalculations();
		calc.setOperand1(3);
		calc.setOperand2(2);
		calc.setOperation("Sub");
		assertEquals(calc.result(), 1,0.00001);
	}

	@Test
	public void testMul() {
		calc=new CreateCalculations();
		calc.setOperand1(2);
		calc.setOperand2(2);
		calc.setOperation("Mul");
		assertEquals(calc.result(), 4,0.00001);
	}

	@Test
	public void testDiv() {
		calc=new CreateCalculations();
		calc.setOperand1(1);
		calc.setOperand2(2);
		calc.setOperation("Div");
		assertEquals(calc.result(), 0.5,0.00001);
	}

	@Test
	public void testMod() {
		calc=new CreateCalculations();
		calc.setOperand1(1);
		calc.setOperand2(2);
		calc.setOperation("Mod");
		assertEquals(calc.result(), 1,0.00001);
	
	}
	
	@Test
	public void testDefault() {
		calc=new CreateCalculations();
		calc.setOperand1(1);
		calc.setOperand2(2);
		calc.setOperation("Def");
		assertEquals(calc.result(), 0,0.00001);

	}

}
