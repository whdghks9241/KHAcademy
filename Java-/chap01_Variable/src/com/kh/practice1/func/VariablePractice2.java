package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public static void main(String[] args) {
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		
		int intNum1, intNum2;
		
		System.out.println("ù ��° ������ �Է����ּ���");
		intNum1 = sc.nextInt();
		
		System.out.println("�� ��° ������ �Է����ּ���");
		intNum2 = sc.nextInt();

		System.out.println("�� ���� ���� : " + (intNum1 + intNum2));
		System.out.println("�� ���� ���̴� : " + (intNum1 - intNum2));
		System.out.println("�� ���� ���� : " + (intNum1 * intNum2));
		System.out.println("�� ���� ������� : " + (intNum1 / intNum2));
		System.out.println("�� ���� �������� : " + (intNum1 % intNum2));
	}
}

