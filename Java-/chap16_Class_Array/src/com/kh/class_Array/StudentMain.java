package com.kh.class_Array;

public class StudentMain {
	public static void main(String[] args) {
		// Student ��ü�� �����ϴ� �迭 ����
		Student[] student = new Student[3];
		
		// �迭�� student ��ü�� �߰�
		student[0] = new Student("�͹���", 17);
		student[1] = new Student("������", 18);
		student[2] = new Student("�ͳʾ�", 19);
	
		// �� ���̸� ���ϰ� ������ length
		// 1�� ° �л��� �̸� student[0].name;
		// 1�� ° �л��� �̸� student[0].age;
		
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("ù ��° �л��� �̸� : " + student[0].name);
		System.out.println("ù ��° �л��� ���� : " + student[0].age);
		System.out.println("");

		// �ι�° �л��� �̸��� ���� ���
		System.out.println("ù ��° �л��� �̸� : " + student[1].name);
		System.out.println("ù ��° �л��� ���� : " + student[1].age);
		System.out.println("");
		// ����° �л��� �̸��� ���� ���
		System.out.println("ù ��° �л��� �̸� : " + student[2].name);
		System.out.println("ù ��° �л��� ���� : " + student[2].age);
		System.out.println("");
		
		// for���� �̿��ؼ� 1��° �л� ~ 3��°�л����� ���
		for (int i = 0; i < student.length; i++) {
			System.out.println(i + " ��° �л��� �̸� : " + student[i].name);
			System.out.println(i + " ��° �л��� ���� : " + student[i].age);
		}
	}
}
