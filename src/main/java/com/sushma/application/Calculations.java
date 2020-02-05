package com.sushma.application;
public class Calculations {
	public int addition(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}

public int multiply(int i, int j) {
		return i * j;
	}

	public double division(double i, double j) {
		if (j == 0) {
			throw new ArithmeticException();
		}
		return i / j;

	}

	 public int substraction(int i, int j) {
		return i-j;
	}

}
