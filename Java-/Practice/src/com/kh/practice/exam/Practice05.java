package com.kh.practice.exam;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		/**
		 * ���� 10
		   1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
