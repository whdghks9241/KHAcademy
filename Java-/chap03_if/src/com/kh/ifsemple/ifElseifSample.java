package com.kh.ifsemple;

public class ifElseifSample {

	public static void main(String[] args) {
		
		// if-else if
		/*
		 ���� ���� ������ ���������� ��
		 �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� �����ϴ� ����
		 ���� if�� else if �� ���ǵ� ���� �ƴ϶�� ������ else ��� ����
		
		 if (����1) {
		 	// ����1�� ���� �� ����Ǵ� �ڵ�
		 } else if (����2) {
		 	// ����2�� ���� �� ����Ǵ� �ڵ�
		 } else {
		 	// ���� ��� ������ ������ �� ����Ǵ� �ڵ�
		 }
		 */
		
		int age = 23;
		
		if (age == 20) {
			System.out.println("�ؿܿ��� ����");
		} else if (age >= 20) {
			System.out.println("���迩�� ����");
		} else {
			System.out.println("���� ������");
		}
		
		// int score = 85;
		/**
		 * ���࿡ 90���� ������ A
		 * 90�� �̸� B+
		 * 90������ �̸��̸� B
		 */
		int score = 85;

		// ���࿡ 90���� ������ A
		if (score > 90) {
			System.out.println("A");
		// 90�� �̸� B+
		} else if (score == 90) {
			System.out.println("B+");
		// 90������ �̸��̸� B	
		} else if (score < 90) {
			System.out.println("B");
		}
		
		
		int hour = 15;
		
		// ���� �ð��� 12�� �����̸�
		if (hour < 12) {
			System.out.println("���� ��ħ�Դϴ�");
		// ���� �ð��� 18�� �����̸�
		} else if (hour < 18) {
			System.out.println("������ �ڵ��սô�");
		// �ð��� 18�� ���� �� ���
		} else {
			System.out.println("�����ϼ̽��ϴ�.");
		}
		
		
		int temp = 28;
		// �µ��� 30�� �ʰ��ϰ��
		if (temp > 30) {
			System.out.println("���� �����Դϴ�.");
		// �µ��� 21~30�� �����ϰ��
		} else if (temp > 20) {
			System.out.println("������ ���� �Դϴ�.");
		// �µ��� 20�� �����ϰ��
		} else {
			System.out.println("�ҽ��� ���� �Դϴ�.");
		}
		
		
		int number = -5;
		
		// 0���� Ŭ�� true
		if (number > 0) {
			System.out.println("����Դϴ�.");
		// 0���� ���� �� true
		} else if (number < 0) {
			System.out.println("�����Դϴ�.");
		// 0�� ��
		} else {
			System.out.println("0 �Դϴ�");
		}
	
	
		
		/*
		 int myAge = 15; ���� ���̰� 15�� �� ��
		 û�ҳ����� ������� �������� ����ϱ� 
		 (���� ��ø�� ��������)
		 */
		int myAge = 15;
		// ���� ���̰� 14 ~ 20��
		if (myAge >= 14 && myAge <= 20 ) {
			System.out.println("û�ҳ� �Դϴ�");
		// ���� ���̰� 21�� �̻��� ��� ����	
		} else if (myAge > 20) {
			System.out.println("���� �Դϴ�");
		// 14�� �̸��� ��� ���� �� ���
		} else {
			System.out.println("��� �Դϴ�");
		}
		
		/* �ٸ���� 1. */
		// ���� ���̰� 15�� �ϰ��
		if (myAge <= 20 ) {
			System.out.println("û�ҳ� �Դϴ�");
		// ���� ���̰� 21�캸�� �������	
		} else if (myAge > 20) {
			System.out.println("���� �Դϴ�");
			// 14�� ������ ��� ���� �� ���
		} else {
			System.out.println("��� �Դϴ�");
		}
		
		
		// ���� ����ϱ�
		int month = 8;
		// 1�� 2�� 12�� �ϰ��
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("�ܿ�");
		// 3~5�� �� ���
		} else if (month >= 3 && month <= 5) {
			System.out.println("��");
		// 6~8�� �� ���
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
		// �׿��� ���ϰ��
		} else { 
			System.out.println("����");
		}
	
	}
}
