package com.kh.example;

public class StudentMain {
	public static void main(String[] arge) {
		// �л��� ��ü ����
		
		Student student1 = new Student("����ȯ",10, "3�г�");
		// �л� ���� ���
		
		student1.displayInfo();
		
		/**
		 *  �л��� 3�� ���� 3���� ����ϱ�
		 */
		Student student2 = new Student("����ȯ2",12, "2�г�");
		
		Student student3 = new Student("����ȯ3",13, "3�г�");
		
		Student student4 = new Student("����ȯ4",14, "4�г�");
		
		student2.displayInfo();
		
		student3.displayInfo();
		
		student4.displayInfo();
		
	}
}
