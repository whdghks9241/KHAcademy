package com.kh.practice.exam;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		/**
		 * ������ ���� ���� ������ �����ϼ���.
			ex.
			���� �Է� : 3 
			*
			**
			***
			** 
			*
		 */
		
		//�߰��� �������� ��/ �Ʒ� ���� ���� for���� �ۼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for (int k = num-1; k >= 1; k--) {
			for (int l= 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
