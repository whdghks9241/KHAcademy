package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {

	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		return sc.nextInt();
	}
	
	// ���� ���
	public void displayResult(int result) {
		System.out.println("��� ��� : " + result);
	}
}
