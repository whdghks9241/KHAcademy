package com.kh.example;

public class Student {
	// 1. �ɹ����� ( �л��� �Ӽ� )
	// �̸�
	String name;
	// ����
	int age;
	// �г�
	String grade;
	
	/**
	 *  ������ / �����ڴ� �޼��� �� �Ϻ�
	 */
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	// �л� ���� ��� �޼���
	public void displayInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("��    �� : " + age);
		System.out.println("��    �� : " + grade);
	}
}
