package com.kh.calculatorMVC;

public class CalculatorModel {

	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calculateSquare() {
		return number * number;
	}
}
