package com.kh.practice.exam;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
	
		/**
		 * ����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		   ��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���
		   
		   �Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
		 */
		
		// �Է¹ޱ� ���� �ҷ����� �޼ҵ�
		Scanner sc = new Scanner(System.in); 
		// ��� �޼ҵ�
		System.out.println("���ڸ� �Է����ּ���"); 
		
		int num = sc.nextInt();
		int num2= 0;
		
		// ���� �Է��Ѽ��� 2���� ���� ���
		if (num < 2) { 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		// ���� �Է��Ѽ��� 2���� Ŭ ���
		} else { 
			// �Ҽ��� ��� 1�� �ڱ��ڽŸ���� ������ �������� ���� ������Ѵ�. -> �������� 0�� Ƚ���� 2ȸ.
			for (int i = 1; i <= num; i++) {
				// �Է��� ������ ���������� 0�ϰ�� 
				if ((num % i) == 0) {
					 // ī��Ʈ�� ��
					 num2 += 1;
				}
			}
			// �������� 0�� Ƚ���� 3ȸ �̻��ϰ�� 
			if (num2 >= 3) {
				System.out.println("�Ҽ��� �ƴմϴ�");
			} else {
				System.out.println("�Ҽ��Դϴ�");
			}
		}
	}
}
