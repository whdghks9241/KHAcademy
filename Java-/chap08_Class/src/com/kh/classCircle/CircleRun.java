package com.kh.classCircle;

public class CircleRun {

	public static void main(String[] args) {
		// �⺻������ ��ü ����!!
		Circle circle = new Circle();
		
		// �ʱ� ���� �ѷ��� ���̸� ����ϰ� ���!!
		System.out.println("�ʱ⿡ ���� ������ �˰�ʹ�");
		// inRadius
		circle.AreaCircle();
		circle.SizeOfCircle();
		
		// �������� 1�� ������Ų��.
		circle.inRadius();
		
		// ���� �ѷ��� ���̰� ������1�� ������ ���� ��� ���
		System.out.println("�������� 1�� ������Ų �� ���� ����");	
		circle.AreaCircle();
		circle.SizeOfCircle();
	}
}
