package com.kh.variable;

public class VariableSample {

	public static void main(String[] args) {
		
		String name;
		name = "����";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';

		System.out.println("�ȳ��ϼ���. �����Դϴ�. ���� 15�ÿ� ��۵˴ϴ�.");
		System.out.println("�ȳ��ϼ���. " + name +"�Դϴ�. ���� "+ hour +"�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score +" �Դϴ�.");
		System.out.println(score + " �� " +grade+"�Դϴ�.");
		
		// ������ �̸��� ���̿� �ڽ��� ����(double)�� �ֱ�
		String my_name = "����ȯ";
		int my_age = 31;
		double my_score = 90.0;
		char my_grade = 'A';
		
		System.out.println("�����ϼ��� ���� " + my_name + " �Դϴ�. �� ���̴� " + my_age + "�� �̰�");
		System.out.println("���� ������ " + my_score + "�Դϴ�. " + my_score + " �� " + my_grade +" �Դϴ�.");
		
		
	}
}
