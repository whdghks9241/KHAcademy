package com.kh.practice.exam;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		/**
		 * ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}
