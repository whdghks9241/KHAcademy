package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {

	public double getUserInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �������� �Է��ϼ���.");
		return sc.nextDouble();
	}
	
	// ���� �ѷ� = ������ x 2 x 3.14
	public void displayResult(double result) {
		System.out.println("���� �ѷ� : " + result);
	}

	// ���� ���� = ������ x ������ x 3.14
	public void displayResult2(double result) {
		System.out.println("���� ���� : " + result);
	}
}
