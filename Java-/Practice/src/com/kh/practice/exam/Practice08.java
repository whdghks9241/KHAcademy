package com.kh.practice.exam;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		/**
		 * ����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		   ��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		if (num >= 10) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		} else if (num >= 1 && num < 10) {
			for (int i = num; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println( i + " * " + j + " = " + (i * j));
				}
			}
		}
	}

}
