package edu.msg.fixtures;

import edu.msg.calculator.Calculator;

public class CreateCalculations {

	private int operand1;
	private int operand2;
	private String operation;

	public CreateCalculations() {
		this.operand1 = 0;
		this.operand2 = 1;
		this.operation = "Add";
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double result() {
		switch (operation) {
		case "Add":
			return Calculator.add(operand1, operand2);

		case "Sub":
			return Calculator.sub(operand1, operand2);

		case "Mul":
			return Calculator.mul(operand1, operand2);

		case "Div":
			return Calculator.div(operand1, operand2);

		case "Mod":
			return Calculator.mod(operand1, operand2);

		default:
			return 0;
		}

	}
}
