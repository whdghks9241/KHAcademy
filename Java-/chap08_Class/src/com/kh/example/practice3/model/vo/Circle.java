package com.kh.example.practice3.model.vo;

public class Circle {

	double PI = 3.14;
	
	int radius = 1;

	public Circle() {
		// �⺻ ������ , �ƹ��� �ʱ�ȭ�� �������� �ʰ� ����

	}
	
	// 
	public void incrementRadius() {
		// 
		System.out.println("���� ������ : " + radius++);
	}
	
	// ���� �ѷ� ���ϱ�
	public void getAreaOfCircle() {
		// (���� ������) X 2 X (������)
		System.out.println("���� �ѷ� : " + (radius * 2) * PI);
	}
	
	// ���� ���� ���ϱ�
	public void getSizeOfCircle() {
		// (���� ������) X (���� ������) X (������)
		System.out.println("���� ���� : " + (radius * radius) * PI);
	}
}
