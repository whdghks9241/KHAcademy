package com.kh.inheriance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorFORMod {

	public static void main(String[] args) {

		/**
		 *  scanner �̿��ؼ� �ڵ� �����ϱ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է����ּ���");
		int firstInput = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ���");
		int secondInput = sc.nextInt();

		CalculatorFORMod cal = new CalculatorFORMod();
		cal.num1 = firstInput;
		cal.num2 = secondInput;

		int result = cal.add();
		int result1 = cal.substruct();
		int result2 = cal.multiply();
		int result3 = cal.divide();
		int result4 = cal.mod(cal.num1, cal.num2);

		System.out.println("Add : " + result);
		System.out.println("substruct : " + result1);
		System.out.println("multiply : " + result2);
		System.out.println("divide : " + result3);
		System.out.println("mod : " + result4);
	}

}
