package edu.msg.calculator;

public class Calculator {

	private Calculator() {

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		return a / (double) b;
	}

	public static int mod(int a, int b) {
		return a % b;
	}

}
