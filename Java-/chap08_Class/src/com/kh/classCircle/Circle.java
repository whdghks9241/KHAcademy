package com.kh.classCircle;

public class Circle {

	// �ɹ� ����
	// private static final double PI = 3.14;
	final double PI = 3.14; // ����
	private int radius = 1; // ���
	
	// ������
	public Circle() {
		// �⺻������
	}
	
	// �޼ҵ�
	// �������� ���� �ߎ�
	public void inRadius() {
		// ������ ���� ������ų ���� ������ ���� �ִ�
		radius++;
	}
	
	public void AreaCircle() {
		// ���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
		double aree = PI * radius * radius;
		System.out.println(aree);
	}
	public void SizeOfCircle() {
		System.out.println("���� ũ�� (������) : radius");
	}


}

