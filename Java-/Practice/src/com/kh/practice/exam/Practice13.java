package com.kh.practice.exam;

import java.util.Scanner;

public class Practice13 {
	
	public static void main(String[] args) {
	
		/**
		 * ������ ���� ���� ������ �����ϼ���.
			ex.
			���� �Է� : 4 
				*
			   ** 
			  *** 
			*****
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
