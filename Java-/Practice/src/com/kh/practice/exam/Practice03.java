package com.kh.practice.exam;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		/**
		 * ���� 3
		   ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		   ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.println("���� : " + i);
			}
		}
	}

}
