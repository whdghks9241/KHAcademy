package com.kh.pattern.mvc.Model;

public class StudentModel {

	/**
	 1. �л� ���� ǥ��
	 	private �̸� ����
	 	getter setter �����
	 */
	
	// �л� �̸�
	private String name;
	// �л� ����
	private int age;
	
	public StudentModel(String name , int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
