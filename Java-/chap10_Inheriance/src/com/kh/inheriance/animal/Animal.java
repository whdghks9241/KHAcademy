package com.kh.inheriance.animal;

// ���� Ŭ���� ����
public class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void info() {
		System.out.println("�̸� " + name);
	}
	public void eat() {
		System.out.println(name + " ���̸� �Խ��ϴ�.");
	}
	
	public void sleep() {
		System.out.println(name + "��(��) ���� ��ϴ�");
	}
}
