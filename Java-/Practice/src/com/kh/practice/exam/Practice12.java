package com.kh.practice.exam;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		/**
		 * 1���� ����ڿ��� �Է� ���� ������ �߿���
			1) 2�� 3�� ����� ��� ����ϰ�
			2) 2�� 3�� ������� ������ ����ϼ���.
			* ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ �� ��� �������� 0�� ������ ��
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		
		int num = sc.nextInt();
		int count = 0;
		for (int i=2; i<=num; i++) {
			if ((i % 2) == 0 || (i % 3) == 0) {
				System.out.print(i + " ");
				if ((i % 6) == 0) {
					count ++;
				}
			} 
		}
		
		System.out.print("count : "  + count);	
	}

}
