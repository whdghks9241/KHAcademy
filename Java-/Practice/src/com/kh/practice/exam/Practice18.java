package com.kh.practice.exam;

import java.util.Scanner;

public class Practice18 {
	public static void main(String[] args) {
		/**
		 	������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
			�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
			������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
			ex.
			0 ~ 6 ���� ���� �Է� : 4 0 ~ 6 ���� ���� �Է� : 7
			�ݿ��� �߸� �Է��ϼ̽��ϴ�.

		 */
		
		Scanner sc = new Scanner(System.in);
		
		// ������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� �����
		String[] stringArray = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.println("0 ~ 6 ������ ������ �Է����ּ���");
		// �Է¹޴� ����
		int inputNum = sc.nextInt();
		
		// ������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		if (inputNum > 6 || inputNum < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			
			System.out.println(stringArray[inputNum] + "����");
		}
		
	}
}
