package com.kh.practice.exam;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while (isTrue) {
			
			System.out.println("���ڸ� �Է����ּ���");
			int num = sc.nextInt();
			int num2= 0;
			if (num < 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} else {
				// �Ҽ��� ��� 1�� �ڱ��ڽŸ���� ������ �������� ���� ������Ѵ�.
				for (int i = 1; i <= num; i++) {
					if ((num % i) == 0) {
						 num2 += 1;
					}
				}
				if (num2 >= 3) {
					System.out.println("�Ҽ��� �ƴմϴ�");
					 isTrue = false;
				} else {
					System.out.println("�Ҽ��Դϴ�");
					 isTrue = false;
				}
			}
		}
	}
}
