package com.kh.practice.exam;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {

		/**
		 * ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է����ּ���");
		int num2 = sc.nextInt();
		
//		if (num1 < num2) {
//			for (int i = num1; i <= num2; i++) {
//				System.out.print(i + " ");
//			}
//		} else if (num2 < num1) {
//			for (int i = num2; i <= num1; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			System.out.println(num1);
//		}
//		
		/**
		 * min(����������), max(���� ������)
		 */
		int minValue = Math.min(num1, num2);
		int maxValue = Math.max(num1, num2);
		
		for (int i = minValue; i <= maxValue; i++) {
			System.out.print(i + " ");
		}
	}
}
