package com.kh.practice.exam;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		/**
		 * 	���� 1
		    ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���
		    �� , �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�
			���� 1�̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println("���� : " + i);
			}
		}
	}
}
