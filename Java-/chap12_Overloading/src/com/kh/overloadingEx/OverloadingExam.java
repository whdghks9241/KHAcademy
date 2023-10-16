package com.kh.overloadingEx;

/**
 java ���� �����
 OverSample.java �����
 �����ε� 5�� ����� �޼��� 5�� ���
 */
public class OverloadingExam {

	// ������ ����
	public int sum(int a, int b) {
		return a+b;
	}
	
	// �� ���� ������ ����
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	// �� ���� �Ǽ��� ����
	public double sum(double a, double b) {
		return a+b;
	}

	public double sum(double a, double b, double c) {
		return a+b+c;
	}
	
	
	public static void main(String[] ergs) {
		
		OverloadingExam obj = new OverloadingExam();
		
		// �޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.sum(50, 50));
		System.out.println("�� ������ �� : " + obj.sum(50, 50, 20));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(51.0, 50.90));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(50.1, 50.5, 10.1));
		
	}
}
