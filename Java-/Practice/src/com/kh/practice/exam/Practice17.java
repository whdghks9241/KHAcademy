package com.kh.practice.exam;

import java.util.Scanner;

public class Practice17 {
	public static void main(String[] args) {
	
		/**
		 	����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
			1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("������ �Է����ּ���");
		// �Է¹޴� ����
		int inputNum = sc.nextInt();
		
		// array�� ���̴� �Է¹��� ������ŭ�� ����
		int[] intArray = new int[inputNum];
		
		// 1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		for (int i = 0; i < inputNum; i++) {
			intArray[i] = i+1;
			
			System.out.print(i+1 + " ");
		}
		
	}
}
